SUMMARY = "Improved implementation of Network Time Protocol"
DESCRIPTION = "A more secure implementation of NTP, derived from NTP Classic, Dave \
Mills’s original."
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.2"

RPM_NAME = "ntpsec-1.2.2-1.3.aarch64.rpm"
RPM_HASH = "8497685b7fdbd79b0a7709039c4921439dffc7cd2b4648ffdf0d7bb60a920f2113281ef4e3a982c42d22c5702ce27d488376218bf088c2107be0011d1d2602ec"

RPROVIDES:${PN} += "config-ntpsec \
ntp-daemon \
ntpsec"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libdns-sd.so.1 \
libm.so.6 \
libnss-usrfiles2 \
libseccomp.so.2 \
libssl.so.3 \
netcfg \
ntpsec-utils \
user-ntp"

inherit rpm
