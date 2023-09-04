SUMMARY = "ClamAV updater library"
DESCRIPTION = "ClamAV is an antivirus engine designed for detecting trojans, \
viruses, malware and other malicious threats."
LICENSE = "GPL-2.0-only"

PV = "0.103.9"

RPM_NAME = "libfreshclam2-0.103.9-1.1.aarch64.rpm"
RPM_HASH = "b65ff95562163d78342faab6173b311681a17d7ee6e2ad855a4ba446d36c6857fdf1e500ad867a3af2b644d721d78afb0fce107020b88e85991878f59db72c33"

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
