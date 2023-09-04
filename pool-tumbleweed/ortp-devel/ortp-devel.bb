SUMMARY = "Headers, libraries and docs for the oRTP library"
DESCRIPTION = "oRTP is a C library implementing the RTP protocol (RFC 1889). \
 \
This package contains header files and development libraries needed to \
develop programs using the oRTP library."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "ortp-devel-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "78d20e968e28785e090355bdb081a526171d7767340039c9ffdd056888f7d568251db648f36559939a6781ed604dfec111f1e69eda035ca55adf3716d29f27aa"

RPROVIDES:${PN} += "cmake-ortp \
libortp-devel \
ortp-devel \
pkgconfig-ortp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
libortp15 \
pkgconfig-bctoolbox"

inherit rpm
