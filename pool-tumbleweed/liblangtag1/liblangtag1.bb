SUMMARY = "C++ library for identification of the language from tags"
DESCRIPTION = "liblangtag is an interface library to access tags for identifying \
languages. \
 \
Features: \
* several subtag registry database supports: \
  - language \
  - extlang \
  - script \
  - region \
  - variant \
  - extension \
  - grandfathered \
  - redundant \
* handling of the language tags \
  - parser \
  - matching \
  - canonicalizing"
LICENSE = "LGPL-3.0-or-later | MPL-2.0"

PV = "0.6.3"

RPM_NAME = "liblangtag1-0.6.3-2.7.aarch64.rpm"
RPM_HASH = "46f88d4ab81d05d3ace4c6ee0fd2b69781b5692fda32d1bc034d05dc1ddc4a681fdcff3e4cfe86a251791e114a75d5157ce081a7b3c2d9b8d1d906001b08db0b"

RPROVIDES:${PN} += "liblangtag-ext-ldml-t.so \
liblangtag-ext-ldml-u.so \
liblangtag.so.1 \
liblangtag1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libxml2.so.2"

inherit rpm
