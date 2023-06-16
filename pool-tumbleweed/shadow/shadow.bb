SUMMARY = "Utilities to Manage User and Group Accounts"
DESCRIPTION = "This package includes the necessary programs for converting plain \
password files to the shadow password format and to manage user and \
group accounts."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.13"

RPM_NAME = "shadow-4.13-6.1.aarch64.rpm"
RPM_HASH = "ce4f4b46e734fe3c6d5397774fbcb3ecc04b3940ca85145de26c13ce9a55d80df5f32b51e40be2a5dec16c6b242dc4fdba2667bf194c0831b58359996c8dba1b"

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
