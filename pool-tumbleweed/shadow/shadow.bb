SUMMARY = "Utilities to Manage User and Group Accounts"
DESCRIPTION = "This package includes the necessary programs for converting plain \
password files to the shadow password format and to manage user and \
group accounts."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.13"

RPM_NAME = "shadow-4.13-6.1.aarch64.rpm"
RPM_HASH = "ce4f4b46e734fe3c6d5397774fbcb3ecc04b3940ca85145de26c13ce9a55d80df5f32b51e40be2a5dec16c6b242dc4fdba2667bf194c0831b58359996c8dba1b"

RPROVIDES:${PN} += "config(shadow) \
pwdutils \
shadow \
shadow(aarch-64) \
useradd_or_adduser_dep"

RDEPENDS:${PN} += "/bin/sh \
group(root) \
group(shadow) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libacl.so.1()(64bit) \
libacl.so.1(ACL_1.1)(64bit) \
libattr.so.1()(64bit) \
libattr.so.1(ATTR_1.1)(64bit) \
libaudit.so.1()(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libeconf.so.0()(64bit) \
libeconf.so.0(LIBECONF_0.2)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpam_misc.so.0()(64bit) \
libpam_misc.so.0(LIBPAM_MISC_1.0)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libsemanage.so.2()(64bit) \
libsemanage.so.2(LIBSEMANAGE_1.0)(64bit) \
libsubid.so.4()(64bit) \
login_defs \
permissions \
user(root)"

inherit rpm
