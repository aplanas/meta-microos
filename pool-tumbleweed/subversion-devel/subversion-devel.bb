SUMMARY = "Development package for Subversion developers"
DESCRIPTION = "The subversion-devel package includes the static libraries and include \
files for developers interacting with the subversion package."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-devel-1.14.2-6.1.aarch64.rpm"
RPM_HASH = "43e61df161aca4f7646cc27758b7bb890813541a9ee8fe9ddd53a81ddb2ddace5e0342404254babab329126d73a69591ba685ef372b88be7544db19ac8c01b46"

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
