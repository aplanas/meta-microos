SUMMARY = "Python framework for efficient cluster administration"
DESCRIPTION = "ClusterShell is a set of tools and a Python library to execute commands \
on cluster nodes in parallel depending on selected engine and worker \
mechanisms. Advanced node sets and node groups handling methods are provided \
to ease and improve the daily administration of large compute clusters or \
server farms. Command line utilities like clush, clubak and nodeset (or \
cluset) allow traditional shell scripts to take benefit of the features \
offered by the library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.1"

RPM_NAME = "clustershell-1.9.1-1.2.noarch.rpm"
RPM_HASH = "a838c25c377fa8220eb85a4c0500b288968057f461d0fbb076f0382651246120e8577f22e28a42f67c64132c2d7afea4aa6ba390109ddb4028d15226417a8b08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clustershell \
config-clustershell \
vim-clustershell"

RDEPENDS:${PN} += "python3-clustershell \
vim"

inherit rpm
