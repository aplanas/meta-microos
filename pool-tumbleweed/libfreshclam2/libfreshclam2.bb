SUMMARY = "ClamAV updater library"
DESCRIPTION = "ClamAV is an antivirus engine designed for detecting trojans, \
viruses, malware and other malicious threats."
LICENSE = "GPL-2.0-only"

PV = "0.103.8"

RPM_NAME = "libfreshclam2-0.103.8-1.4.aarch64.rpm"
RPM_HASH = "a84163b35275f2f3aedb7da505e087b3592c43d689a565648b67bf289f3e0543def609e4c54cab6c56d6a03c8fdeaf2df6e77e3e37bd1ca3f84ed72c05637faf"

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
