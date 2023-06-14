SUMMARY = "YASM development package"
DESCRIPTION = "This package includes everything needed to develop programs that use \
libyasm."
LICENSE = "Artistic-1.0 & BSD-2-Clause & BSD-3-Clause & GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "yasm-devel-1.3.0-7.3.aarch64.rpm"
RPM_HASH = "3e95a762ca2547b2069bb3008c75fd5a5c524a52cfb71378b066dca3b9c1555bbfc2cd781ed68105a8c542ca8d4fb77cb46f2f6940425b380ff341bca200b0db"

RPROVIDES:${PN} += "yasm-devel"

RDEPENDS:${PN} += "yasm"

inherit rpm
