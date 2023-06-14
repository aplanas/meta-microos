SUMMARY = "Header files for the AX.25 library"
DESCRIPTION = "Header files for libax25. Used to build packages that are \
linked against kernel ax25."
LICENSE = "LGPL-2.1+"

PV = "0.0.12~rc5"

RPM_NAME = "libax25-devel-0.0.12~rc5-1.9.aarch64.rpm"
RPM_HASH = "affe9349f554878b5a13ebc66dda5a0045d5b52be669c4d91d25ce5207c4277123a88b3eebc922b6cf47e44d8b4086b602596daac6d3839c74a4924477114525"

RPROVIDES:${PN} += "libax25-devel"

RDEPENDS:${PN} += "libax25-0 \
libax25io0"

inherit rpm
