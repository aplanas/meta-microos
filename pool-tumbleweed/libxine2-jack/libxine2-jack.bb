SUMMARY = "Jack plugin for xine"
DESCRIPTION = "xine sound output plugin for the jack soundserver \
 \
 \
 \
Authors: \
-------- \
    Guenter Bartsch <guenter@users.sourceforge.net>"
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain"

PV = "1.2.13"

RPM_NAME = "libxine2-jack-1.2.13-2.2.aarch64.rpm"
RPM_HASH = "2845a7409fce9a84757762bab01e23f71347e41238452c9d97f866441265b07388743a8546b9739d56759f62a383ee9d2c57ef81a93cdb54a0e8baf56532aeaf"

RPROVIDES:${PN} += "libxine2-jack \
libxine2-jack(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libjack.so.0()(64bit) \
libxine.so.2()(64bit) \
libxine2"

inherit rpm
