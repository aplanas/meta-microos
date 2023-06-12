SUMMARY = "HTML documentation and examples for gettext-runtime"
DESCRIPTION = "This subpackage contains the HTML version of the gettext documentation \
as well as project examples."
LICENSE = "GPL-3.0-or-later & LGPL-2.0-or-later"

PV = "0.21.1"

RPM_NAME = "gettext-runtime-tools-doc-0.21.1-2.1.noarch.rpm"
RPM_HASH = "f772e9dfde5e351697f045d455feb3f462355a75436a5d507a80dee34caa8bc7a436a16525a9656f064c44b01a9ff256d5fde7fca3c973494fe62727e97c5fda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gettext-runtime-tools-doc"
RDEPENDS:${PN} += ""

inherit rpm
