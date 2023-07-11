SUMMARY = "ClamAV antivirus engine runtime"
DESCRIPTION = "ClamAV is an antivirus engine designed for detecting trojans, \
viruses, malware and other malicious threats."
LICENSE = "GPL-2.0-only"

PV = "0.103.8"

RPM_NAME = "libclamav9-0.103.8-1.4.aarch64.rpm"
RPM_HASH = "7a1d9b3302516561dad33adfffb8679417b56a8e881427f876bb11ad06d61c1faec61a426130a408794854a499a720d874c0127fd7e51700755b2b29248eb114"

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
