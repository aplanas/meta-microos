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

RPM_NAME = "perl-Encode-EUCJPASCII-0.03-5.37.aarch64.rpm"
RPM_HASH = "6c50232181b4c9d141ab8150c9ab4074637b2372a6d2c9dfb84fba801eb0bc2b571961025adc2321c9583400f0686920c9d2a282eee3bc3070d9e6c762b40017"

RPROVIDES:${PN} += "perl-Encode--EUCJPASCII \
perl-Encode-EUCJPASCII"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
