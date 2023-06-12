SUMMARY = "Documentation for qt6-multimedia in QCH format"
DESCRIPTION = "This package contains documentation for qt6-multimedia in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimedia-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b6c754743f077847f36f1c80783d7adfabda7b7bee61309b51fa05e3d9138486db5d00ac12c83ebf2401bb2ae052a2235291d960cd28af42170b9969653ba29d"

RPROVIDES:${PN} += "qt6-multimedia-docs-qch \
qt6-multimedia-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
