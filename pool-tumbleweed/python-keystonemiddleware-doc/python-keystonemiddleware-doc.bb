SUMMARY = "Documentation for Middleware for OpenStack Identity"
DESCRIPTION = "Documentation for Middleware for OpenStack Identity."
LICENSE = "Apache-2.0"

PV = "10.4.0"

RPM_NAME = "python-keystonemiddleware-doc-10.4.0-1.1.noarch.rpm"
RPM_HASH = "4c8b3487cc65b7c6cef76783bd9d1f006b8eeb77b1fc594d403802355f609b41ab18d1d63a332037561113ba102d41311489e60bb3c0e4094be23f3420c93e28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-keystonemiddleware-doc"

RDEPENDS:${PN} += ""

inherit rpm
