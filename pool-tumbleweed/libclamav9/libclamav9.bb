SUMMARY = "ClamAV antivirus engine runtime"
DESCRIPTION = "ClamAV is an antivirus engine designed for detecting trojans, \
viruses, malware and other malicious threats."
LICENSE = "GPL-2.0-only"

PV = "0.103.9"

RPM_NAME = "libclamav9-0.103.9-1.1.aarch64.rpm"
RPM_HASH = "ccb39ca78ae44166bc3b29fa58f702f5ce4dd157b76cc9739ccc3e74f283813ae9d72238c8b67cc246e2291f587f678fd56acc3949366695ffdafd8a74204b22"

RPROVIDES:${PN} += "libclamav.so.9 \
libclamav9 \
libclamunrar-iface.so.9 \
libclamunrar.so.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libjson-c.so.5 \
libltdl.so.7 \
libm.so.6 \
libmspack.so.0 \
libpcre2-8.so.0 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
