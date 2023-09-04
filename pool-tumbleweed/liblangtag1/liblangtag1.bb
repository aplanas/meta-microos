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

PV = "0.6.4"

RPM_NAME = "liblangtag1-0.6.4-1.1.aarch64.rpm"
RPM_HASH = "62740c7d1a5837741b553cc2eb410ebdd069854d54a37a49bfa7dc8c20194f9e39ab06d1c0dd20160e2e0d6c19f85f8d604f31314949c8364a413b5ad01af7c5"

RPROVIDES:${PN} += "liblangtag-ext-ldml-t.so \
liblangtag-ext-ldml-u.so \
liblangtag.so.1 \
liblangtag1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libxml2.so.2"

inherit rpm
