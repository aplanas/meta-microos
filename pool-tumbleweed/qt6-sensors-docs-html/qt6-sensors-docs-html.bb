SUMMARY = "Documentation for qt6-sensors in HTML format"
DESCRIPTION = "This package contains documentation for qt6-sensors in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-sensors-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0e4807c736ae09d8531b27655d49c9a09f6398b2cdd88aeedeff7558fbd09220e31c0718560a20dadca87bece558a010f2b38d38bda11fe79a24a5da81ba33a5"

RPROVIDES:${PN} += "qt6-sensors-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
