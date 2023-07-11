SUMMARY = "Header files for the AX.25 library"
DESCRIPTION = "Header files for libax25. Used to build packages that are \
linked against kernel ax25."
LICENSE = "LGPL-2.1+"

PV = "0.0.12~rc5"

RPM_NAME = "libax25-devel-0.0.12~rc5-1.10.aarch64.rpm"
RPM_HASH = "cec9c81ae3706ec87e9f95e144bf71c893f30a3b3376728363c19e8f5c1e4d46b6ad339fdc6ef4b1f00dcf6dbeb264b44a03a92d85cb25c1b3b403cfdb075480"

RPROVIDES:${PN} += "libax25-devel"

RDEPENDS:${PN} += "libax25-0 \
libax25io0"

inherit rpm
