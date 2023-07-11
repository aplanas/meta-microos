SUMMARY = "JBIG1 lossless image compression library -- development files"
DESCRIPTION = "The libjbig-devel package contains files needed for development using \
the JBIG-KIT image compression library."
LICENSE = "GPL-2.0-or-later"

PV = "2.1"

RPM_NAME = "libjbig-devel-2.1-4.5.aarch64.rpm"
RPM_HASH = "672808b01364fda020268f6f41f5359f271e55f08c4184481fa0358af42c169b5e3139b788323a8d8a903addc90232c2ade21cd3bc6ea74049749fdd792aaa5c"

RPROVIDES:${PN} += "libjbig-devel"

RDEPENDS:${PN} += "libjbig2"

inherit rpm
