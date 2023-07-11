SUMMARY = "Examples for qbs"
DESCRIPTION = "This package contains examples to show different qbs usages."
LICENSE = "LGPL-3.0-only"

PV = "2.0.2"

RPM_NAME = "qbs-examples-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "0ae6e632764847de6e8775a225aa59a3d15c0ae82552df018eabfb2f320084e761d5774f9154cc561714598543c109b99c19e92e1ee5f5b1865c79b68d5f3af4"

RPROVIDES:${PN} += "qbs-examples"

RDEPENDS:${PN} += "qbs"

inherit rpm
