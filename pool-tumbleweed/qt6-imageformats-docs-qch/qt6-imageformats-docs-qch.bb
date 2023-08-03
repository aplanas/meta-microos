SUMMARY = "Documentation for qt6-imageformats in QCH format"
DESCRIPTION = "This package contains documentation for qt6-imageformats in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-imageformats-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7eea09af136567b6de8b7bcfc72ddb54531827b6443cdb8b619a7fcb53f1be47a92cec31c68598177967c214a203bd4a482fcdf674139b4e28a6c052e6f67373"

RPROVIDES:${PN} += "qt6-imageformats-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
