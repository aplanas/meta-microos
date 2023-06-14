SUMMARY = "Development package for Subversion developers"
DESCRIPTION = "The subversion-devel package includes the static libraries and include \
files for developers interacting with the subversion package."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-devel-1.14.2-5.3.aarch64.rpm"
RPM_HASH = "d57b9683b4d8bd4e79b82dde52479d1139d2034a967ad78d3beaa171c39d6b3e8f65cbc316c43ceb301470e1281c0a96050d1975bb58f21b7800c9a1e3ce62a5"

RPROVIDES:${PN} += "pkgconfig-libsvn-auth-gnome-keyring \
pkgconfig-libsvn-auth-kwallet \
pkgconfig-libsvn-client \
pkgconfig-libsvn-delta \
pkgconfig-libsvn-diff \
pkgconfig-libsvn-fs \
pkgconfig-libsvn-fs-base \
pkgconfig-libsvn-fs-fs \
pkgconfig-libsvn-fs-util \
pkgconfig-libsvn-fs-x \
pkgconfig-libsvn-ra \
pkgconfig-libsvn-ra-local \
pkgconfig-libsvn-ra-serf \
pkgconfig-libsvn-ra-svn \
pkgconfig-libsvn-repos \
pkgconfig-libsvn-subr \
pkgconfig-libsvn-wc \
subversion-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libapr-util1-devel \
pkgconfig-apr-1 \
pkgconfig-apr-util-1 \
pkgconfig-libsecret-1 \
pkgconfig-serf-1 \
pkgconfig-sqlite3 \
subversion"

inherit rpm
