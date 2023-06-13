SUMMARY = "Screen reader for the Linux console"
DESCRIPTION = "SUSE blinux is a screen reader for the Linux console. It supports \
braille displays."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.0.20130317.git7a75bc29"

RPM_NAME = "sbl-3.5.0.20130317.git7a75bc29-6.14.aarch64.rpm"
RPM_HASH = "26883acfa4ef74c6ac4f3c964e579a69603b578c6a6209df2ac0e5b55e76dfbc56f08bfeb4910621e8ae16217cae0bb3de65061ee1784135e17f11bcfccb6589"

RPROVIDES:${PN} += "config(sbl) \
libbrld.so.1()(64bit) \
libsbl-alva.so.2()(64bit) \
libsbl-alvausb.so.2()(64bit) \
libsbl-baum.so.2()(64bit) \
libsbl-fhp.so.2()(64bit) \
libsbl-fhp_usb.so.2()(64bit) \
libsbl-ht.so.2()(64bit) \
libsbl-none.so.2()(64bit) \
libsbl-pwrbrl.so.2()(64bit) \
libsbl-tieman.so.2()(64bit) \
sbl \
sbl(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
