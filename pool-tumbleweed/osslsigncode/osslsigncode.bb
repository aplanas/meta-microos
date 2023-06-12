SUMMARY = "Platform-independent tool for Authenticode signing of EXE/CAB files"
DESCRIPTION = "osslsigncode is a small utility for placing signatures on Microsoft cabinate \
files and executables."
LICENSE = "GPL-3.0-only"

PV = "2.3.0"

RPM_NAME = "osslsigncode-2.3.0-1.7.aarch64.rpm"
RPM_HASH = "0c5219d60b0c93145b8c67810a33bef5ff6a4370a57bf7424a5d731ce93fd6eaadce8e8fe225a01f75627c5c68702a69579fbe63c1739fcd37931ce9c1d732b7"

RPROVIDES:${PN} += "osslsigncode \
osslsigncode(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit)"

inherit rpm
