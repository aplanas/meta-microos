SUMMARY = "Documentation for kid3"
DESCRIPTION = "This package provides documentation and help files for kid3."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.3"

RPM_NAME = "kid3-doc-3.9.3-1.4.aarch64.rpm"
RPM_HASH = "640ece743e5121c84e24f66d254c53866d39b3fd1fe037f88e8770cf038b84a0a5878b34652be118db5714611d9a84415223868b4533bff7d922fdcdcdd9c897"

RPROVIDES:${PN} += "kid3-doc"

RDEPENDS:${PN} += "kid3"

inherit rpm
