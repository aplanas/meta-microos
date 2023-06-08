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

RPM_NAME = "clustershell-1.9.1-1.1.noarch.rpm"
RPM_HASH = "f83d91e969a98dde4b5aa61220be6b8cefe277fd653c471592148691ca4187212637ef6c040f8ce972ffd1b5061b8852b865b24da339b8008a693aa8a8f61c57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clustershell config(clustershell) vim-clustershell"
RDEPENDS:${PN} += "python3-clustershell vim"

inherit rpm
