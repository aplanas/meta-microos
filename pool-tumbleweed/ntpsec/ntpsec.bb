SUMMARY = "Improved implementation of Network Time Protocol"
DESCRIPTION = "A more secure implementation of NTP, derived from NTP Classic, Dave \
Mills’s original."
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.2"

RPM_NAME = "ntpsec-1.2.2-1.5.aarch64.rpm"
RPM_HASH = "05488818dabf40e41fbc829793118c65fced56835a564f5a8ca103d7666cdf95aacb22d553b9c16422c9cc0d0058d4bc77611d4f49293fc027a09f87a3c80475"

RPROVIDES:${PN} += "config-ntpsec \
ntp-daemon \
ntpsec"

RDEPENDS:${PN} += "/usr/bin/sh \
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
