SUMMARY = "Development libraries and examples for Mozilla LDAP C SDK"
DESCRIPTION = "Header and Library files for doing development with the Mozilla LDAP C SDK."
LICENSE = "MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "6.0.7"

RPM_NAME = "mozldap-devel-6.0.7-4.17.aarch64.rpm"
RPM_HASH = "2061f33a9e42146772242de85c4c382b760cfa89a82f40bacdea8568b0826ba4f514c0270cb96d1fee9b13f0eb8f6b9dd224d9a48ed2d240481f510e67a1c767"

RPROVIDES:${PN} += "mozldap-devel \
pkgconfig-mozldap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mozilla-nspr-devel \
mozilla-nss-devel \
mozldap-libs \
pkgconfig \
pkgconfig-nspr \
pkgconfig-nss"

inherit rpm
