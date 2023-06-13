SUMMARY = "ClamAV antivirus engine runtime"
DESCRIPTION = "ClamAV is an antivirus engine designed for detecting trojans, \
viruses, malware and other malicious threats."
LICENSE = "GPL-2.0-only"

PV = "0.103.8"

RPM_NAME = "libclamav9-0.103.8-1.3.aarch64.rpm"
RPM_HASH = "a42ecb79d621c972462dca7b8a072bf5aa55ecf7bc007b4ccbc0862324f1413b4ca700ad7c1ea118d41ed3e76192a80ee80ee5f374d8419ca6490fe6ef1413e3"

RPROVIDES:${PN} += "libclamav.so.9()(64bit) \
libclamav.so.9(CLAMAV_PRIVATE)(64bit) \
libclamav.so.9(CLAMAV_PUBLIC)(64bit) \
libclamav9 \
libclamav9(aarch-64) \
libclamunrar.so.9()(64bit) \
libclamunrar.so.9(CLAMAV_PRIVATE_UNRAR)(64bit) \
libclamunrar_iface.so.9()(64bit) \
libclamunrar_iface.so.9(CLAMAV_PRIVATE)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libjson-c.so.5()(64bit) \
libltdl.so.7()(64bit) \
libm.so.6()(64bit) \
libmspack.so.0()(64bit) \
libpcre2-8.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
