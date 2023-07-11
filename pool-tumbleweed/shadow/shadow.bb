SUMMARY = "Utilities to Manage User and Group Accounts"
DESCRIPTION = "This package includes the necessary programs for converting plain \
password files to the shadow password format and to manage user and \
group accounts."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.13"

RPM_NAME = "shadow-4.13-6.3.aarch64.rpm"
RPM_HASH = "50f9aad17a1c180cbbf8b7535c5d250456294392caf8fb60cda76146cadc520200669008326fb383b4599bcb2ad05ec054bc2f2b934b9d17d7169c9546f6202f"

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
