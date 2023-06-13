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

RPM_NAME = "perl-Encode-EUCJPASCII-0.03-5.35.aarch64.rpm"
RPM_HASH = "65488a8000bd26e3a52d410206688a9f5b0ae6658bfb964fe2b1d8abd57409dce1f455e6c9241f8c76ff96da889e4d1158ee06932c25e2409067bc51eb5a4069"

RPROVIDES:${PN} += "perl(Encode::EUCJPASCII) \
perl-Encode-EUCJPASCII \
perl-Encode-EUCJPASCII(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
