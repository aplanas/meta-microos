SUMMARY = "FirewallD RPM macros"
DESCRIPTION = "This package provides the firewalld RPM macros file needed by packages \
which provide their own firewalld service files."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "firewall-macros-2.0.0-1.1.noarch.rpm"
RPM_HASH = "f25ba2dfaea6d1b8700a23a5857658802541ea9c72a72ad7384d6fe90c2e2650e6faa74c6c9c2e2edbf042f86e99a5f978aa5c20b199cec150fd0f72ce40b6d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewall-macros \
rpm-macro-firewalld-reload"

RDEPENDS:${PN} += ""

inherit rpm
