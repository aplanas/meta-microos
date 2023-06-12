SUMMARY = "Documentation for qt6-serialport in QCH format"
DESCRIPTION = "This package contains documentation for qt6-serialport in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-serialport-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8508a5eec4afaf3d512a9270b6973493dbe8ee4e625e5c6406b86279e3e24f25ca514bcb12953d17bb060fdebe5693e4b145fa824982f9194ce014639fda56bc"

RPROVIDES:${PN} += "qt6-serialport-docs-qch \
qt6-serialport-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
