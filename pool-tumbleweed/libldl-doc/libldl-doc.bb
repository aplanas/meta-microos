SUMMARY = "Documentation for libldl"
DESCRIPTION = "Documentation for libldl."
LICENSE = "LGPL-2.1-or-later"

PV = "5.13.0"

RPM_NAME = "libldl-doc-5.13.0-49.1.aarch64.rpm"
RPM_HASH = "96c7030836f0a1ef7a8a3a97b2bf1591ff0cc77dfb05bc0c77853c03ec2cb41b6dc8ed8d0e729d10819423356948fb29d6933a24d556215312040191e7c0bb39"

RPROVIDES:${PN} += "libldl-doc \
libldl-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
