SUMMARY = "ClamAV updater library"
DESCRIPTION = "ClamAV is an antivirus engine designed for detecting trojans, \
viruses, malware and other malicious threats."
LICENSE = "GPL-2.0-only"

PV = "0.103.8"

RPM_NAME = "libfreshclam2-0.103.8-1.3.aarch64.rpm"
RPM_HASH = "c4bb957906b4c06ba43e0ce72a23d1951ba2e4273350a4a810101915b2bd98ce36e5f5d2f6f0c454d48509d4dcdee00c0d7e098760fb7d5bd4cbb8c580615a38"

RPROVIDES:${PN} += "libfreshclam.so.2 \
libfreshclam2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclamav.so.9 \
libcrypto.so.3 \
libcurl.so.4 \
libm.so.6 \
libz.so.1"

inherit rpm
