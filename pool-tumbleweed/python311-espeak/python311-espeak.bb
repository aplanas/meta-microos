SUMMARY = "Python bindings for espeak"
DESCRIPTION = "Python bindings for the eSpeak speech synthesizer."
LICENSE = "GPL-3.0-or-later"

PV = "0.5"

RPM_NAME = "python311-espeak-0.5-5.24.aarch64.rpm"
RPM_HASH = "82433edaae90e3d3cd6397cb8fbb12dbb11e269a139b71ded1f860c65ea84c2f72f1d8e20b42fa324b63946ba6532ec400505eae38279c6d1cac0fab7acee1fd"

RPROVIDES:${PN} += "python3.11dist(python-espeak) \
python311-espeak \
python311-espeak(aarch-64) \
python3dist(python-espeak)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libespeak.so.1()(64bit) \
python(abi)"

inherit rpm
