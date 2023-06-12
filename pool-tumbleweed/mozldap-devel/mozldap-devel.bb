SUMMARY = "Development libraries and examples for Mozilla LDAP C SDK"
DESCRIPTION = "Header and Library files for doing development with the Mozilla LDAP C SDK."
LICENSE = "MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "6.0.7"

RPM_NAME = "mozldap-devel-6.0.7-4.15.aarch64.rpm"
RPM_HASH = "43dcab784377678e6547968b77812d3d8f0dbd39241b379264024ce99d993c3bf5b5b3d1f3e2640008349445b0f44d165ec688527734e9c20a0f771a25bd6447"

RPROVIDES:${PN} += "mozldap-devel \
mozldap-devel(aarch-64) \
pkgconfig(mozldap)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
mozilla-nspr-devel \
mozilla-nss-devel \
mozldap-libs \
pkgconfig \
pkgconfig(nspr) \
pkgconfig(nss)"

inherit rpm
