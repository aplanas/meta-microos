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
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
libltdl.so.7()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmspack.so.0()(64bit) \
libpcre2-8.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.5.2)(64bit) \
libxml2.so.2(LIBXML2_2.5.7)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.3.3)(64bit)"

inherit rpm
