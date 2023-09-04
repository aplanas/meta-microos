SUMMARY = "Utilities to Manage User and Group Accounts"
DESCRIPTION = "This package includes the necessary programs for converting plain \
password files to the shadow password format and to manage user and \
group accounts."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "shadow-4.14.0-1.1.aarch64.rpm"
RPM_HASH = "54e56303e0873d027dc40cf9021e0031187e8b8e1dde7b488f28937bf7832c1631a3a4cd58a958b73332c14abc83a6573cd3a41742eed9210f63e63104c213b8"

RPROVIDES:${PN} += "config-shadow \
pwdutils \
shadow \
useradd-or-adduser-dep"

RDEPENDS:${PN} += "/usr/bin/sh \
group-root \
group-shadow \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libattr.so.1 \
libaudit.so.1 \
libc.so.6 \
libcrypt.so.1 \
libeconf.so.0 \
libpam-misc.so.0 \
libpam.so.0 \
libselinux.so.1 \
libsemanage.so.2 \
libsubid.so.4 \
login-defs \
permissions \
user-root"

inherit rpm
