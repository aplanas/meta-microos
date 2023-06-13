SUMMARY = "Documentation files for cal3D"
DESCRIPTION = "This package contains modeling documention and a users guide \
for cal3d."
LICENSE = "LGPL-2.1+"

PV = "0.120"

RPM_NAME = "cal3d-doc-0.120-3.10.aarch64.rpm"
RPM_HASH = "2cabbbc41bb2f3c3fa39744592055c72c7c06e4cb312be9c1db2307e950f1f80f2ff7de9517ed31b5e8ea754b8ef76fe4562a51f2ef996c12e7e2d75b556444d"

RPROVIDES:${PN} += "cal3d-doc \
cal3d-doc(aarch-64)"

RDEPENDS:${PN} += "cal3d"

inherit rpm
