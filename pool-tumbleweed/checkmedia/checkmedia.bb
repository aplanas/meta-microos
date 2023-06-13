SUMMARY = "Check installation or Live media"
DESCRIPTION = "The program checks installation or Live media for errors."
LICENSE = "GPL-3.0-or-later"

PV = "6.2"

RPM_NAME = "checkmedia-6.2-1.1.aarch64.rpm"
RPM_HASH = "6e1401225d4260b2e76accee94243dbf02a03d0a17b13411744625d5ca63f0c0b19c5b4b9c02ba5b19544379bb8d9c616f7b477facccdd5559e4e393fad163ff"

RPROVIDES:${PN} += "checkmedia \
checkmedia(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
libc.so.6()(64bit) \
libmediacheck.so.6()(64bit)"

inherit rpm
