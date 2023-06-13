SUMMARY = "ACARS SDR decoder"
DESCRIPTION = "A multi-channels acars decoder with built-in rtl_sdr front end. \
It comes with a database backend : acarsserv to store receved acars messages."
LICENSE = "GPL-2.0-or-later"

PV = "3.7"

RPM_NAME = "acarsdec-3.7-1.2.aarch64.rpm"
RPM_HASH = "9fba08a60648218b2703d687b123aa30d4f71b452c327de26066c319c4b9979483c84f8dbef16eb57b9be1827755ff132c8b7c79552eeb33eaeaac78c8318e17"

RPROVIDES:${PN} += "acarsdec \
acarsdec(aarch-64) \
bundled(cJSON)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libacars-2.so.2()(64bit) \
libacars-2.so.2(ACARS_2.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit)"

inherit rpm
