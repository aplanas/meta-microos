SUMMARY = "Tools for Password Checking and Generation"
DESCRIPTION = "The pwqcheck program checks passphrase quality using the libpasswdqc library. \
The pwqgen program generates a random passphrase using the libpasswdqc library."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "passwdqc-1.4.0-2.7.aarch64.rpm"
RPM_HASH = "4546e1ef24543e35ed0d989358c3c4b8852c427b8ca28bde57fcd3c82781ae8f13745c2203d48b6fd08a790008aa4ed15b26c963a62b6bc71d9b2d970f585536"

RPROVIDES:${PN} += "config(passwdqc) \
passwdqc \
passwdqc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpasswdqc.so.0()(64bit)"

inherit rpm
