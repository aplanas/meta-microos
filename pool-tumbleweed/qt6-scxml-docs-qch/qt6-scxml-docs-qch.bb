SUMMARY = "Documentation for qt6-scxml in QCH format"
DESCRIPTION = "This package contains documentation for qt6-scxml in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "ed60a0eb896303007b4b68b1d69f3892fe76ac530ec8dd0b99569a080b0af29bc6794ec8e0bb8e3956ef8d73a59d8d81a7f57bda98d8547891603105e71a4da0"

RPROVIDES:${PN} += "qt6-scxml-docs-qch"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
