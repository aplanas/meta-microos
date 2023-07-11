SUMMARY = "OFX Command Parser and API"
DESCRIPTION = "LibOFX is a parser and API for applications to support \
OFX command responses, usually provided by financial institutions for \
statement downloads."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.5"

RPM_NAME = "libofx-0.10.5-1.7.aarch64.rpm"
RPM_HASH = "7c4106569a91d906ce54b140848fa080159cf22b9cc145e0e100fc60dcabf775890f8a7b52cd70d1149c7cbe8993fcae0763343204540632abe09fd30b23a086"

RPROVIDES:${PN} += "libofx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libglibmm-2.4.so.1 \
libofx.so.7 \
libstdc++.so.6 \
libxml++-2.6.so.2"

inherit rpm
