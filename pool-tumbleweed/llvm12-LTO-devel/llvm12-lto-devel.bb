SUMMARY = "Link-time optimizer for LLVM (devel package)"
DESCRIPTION = "This package contains the link-time optimizer for LLVM. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "llvm12-LTO-devel-12.0.1-12.1.aarch64.rpm"
RPM_HASH = "6e002b7d6ab1170d537c45e490ec04cf595eeed59714b5f9a9f5b3697536bff5109dd55ce6e4a0534623f5cf6f797a493284a2d714f00492fb16775a14430963"

RPROVIDES:${PN} += "libLTO.so \
llvm12-LTO-devel \
llvm12-LTO-devel(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libLTO12 \
llvm12-devel"

inherit rpm
