SUMMARY = "A small program to jack"
DESCRIPTION = "jack_capture is a small program to capture whatever \
sound is going out to your speakers into a file."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.73"

RPM_NAME = "jack_capture-0.9.73-1.13.aarch64.rpm"
RPM_HASH = "8b2fdfda15fc7b94a5fab8235d445b404f6ad531ba4d58ed9be7ac309a7282e8e4111e7f608191db998fa002431e863fc98244be46419b0b734ae8b6c27f2459"

RPROVIDES:${PN} += "jack-capture"

RDEPENDS:${PN} += "libc.so.6 \
libjack.so.0 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
