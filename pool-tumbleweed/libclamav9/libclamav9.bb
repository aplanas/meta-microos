SUMMARY = "ClamAV antivirus engine runtime"
DESCRIPTION = "ClamAV is an antivirus engine designed for detecting trojans, \
viruses, malware and other malicious threats."
LICENSE = "GPL-2.0-only"

PV = "0.103.8"

RPM_NAME = "libclamav9-0.103.8-1.3.aarch64.rpm"
RPM_HASH = "a42ecb79d621c972462dca7b8a072bf5aa55ecf7bc007b4ccbc0862324f1413b4ca700ad7c1ea118d41ed3e76192a80ee80ee5f374d8419ca6490fe6ef1413e3"

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
