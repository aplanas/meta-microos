SUMMARY = "An eucJP-open mapping"
DESCRIPTION = "This module provides eucJP-ascii, one of eucJP-open mappings, and its \
derivative. Following encodings are supported. \
 \
  Canonical    Alias                           Description \
  -------------------------------------------------------------- \
  eucJP-ascii                                  eucJP-ascii \
               qr/\\beuc-?jp(-?open)?(-?19970715)?-?ascii$/i \
  x-iso2022jp-ascii                            7-bit counterpart \
               qr/\\b(x-)?iso-?2022-?jp-?ascii$/i \
  -------------------------------------------------------------- \
 \
*Note*: 'x-iso2022jp-ascii' is unofficial encoding name: It had never been \
registered by any standards bodies."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.03"

RPM_NAME = "perl-Encode-EUCJPASCII-0.03-5.36.aarch64.rpm"
RPM_HASH = "615a9b7befb71d4f5a7c38c3130ba3de2a16b592bbed79a32f1403bed824a915501f84ffb15b7ff85d6b0be03b5aa6c30a61d0c56c6406763beb0c1bd0c1ab66"

RPROVIDES:${PN} += "perl-Encode--EUCJPASCII \
perl-Encode-EUCJPASCII"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
