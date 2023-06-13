SUMMARY = "Library for checking installation or Live media"
DESCRIPTION = "Library for checking installation or Live media. Used by checkmedia and linuxrc."
LICENSE = "GPL-3.0-or-later"

PV = "6.2"

RPM_NAME = "libmediacheck6-6.2-1.1.aarch64.rpm"
RPM_HASH = "2c425a41f136deeb4ef7478769c7c7700904027bfad248ce935aa17dc7f0330062147f82ea0b661cf5b16a60f7d0e9e35fc2a104628b8a9d6fdc50d827181ca4"

RPROVIDES:${PN} += "libmediacheck.so.6()(64bit) \
libmediacheck6 \
libmediacheck6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
gpg \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
