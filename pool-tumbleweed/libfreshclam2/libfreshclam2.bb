SUMMARY = "ClamAV updater library"
DESCRIPTION = "ClamAV is an antivirus engine designed for detecting trojans, \
viruses, malware and other malicious threats."
LICENSE = "GPL-2.0-only"

PV = "0.103.8"

RPM_NAME = "libfreshclam2-0.103.8-1.3.aarch64.rpm"
RPM_HASH = "c4bb957906b4c06ba43e0ce72a23d1951ba2e4273350a4a810101915b2bd98ce36e5f5d2f6f0c454d48509d4dcdee00c0d7e098760fb7d5bd4cbb8c580615a38"

RPROVIDES:${PN} += "libfreshclam.so.2()(64bit) \
libfreshclam.so.2(FRESHCLAM_PRIVATE)(64bit) \
libfreshclam.so.2(FRESHCLAM_PUBLIC)(64bit) \
libfreshclam2 \
libfreshclam2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libclamav.so.9()(64bit) \
libclamav.so.9(CLAMAV_PRIVATE)(64bit) \
libclamav.so.9(CLAMAV_PUBLIC)(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libm.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
