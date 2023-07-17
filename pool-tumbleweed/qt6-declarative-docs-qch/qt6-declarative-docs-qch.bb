SUMMARY = "Documentation for qt6-declarative in QCH format"
DESCRIPTION = "This package contains documentation for qt6-declarative in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-declarative-docs-qch-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "987defd18f25b697b4640bf762e4f09c0338fc151bd6ad6f29000bd5aa36dbe7a458d9d8894f70916d9434b8dedc5603e8bc6680c26f27ef3ac5ef8289c37d6c"

RPROVIDES:${PN} += "qt6-declarative-docs-qch \
qt6-quickcontrols2-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
