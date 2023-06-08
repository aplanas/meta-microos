SUMMARY = "Antivirus Toolkit"
DESCRIPTION = "ClamAV is an antivirus engine designed for detecting trojans, \
viruses, malware and other malicious threats. It is the de-facto \
standard for mail gateway scanning. It provides a multi-threaded \
scanning daemon, command line utilities for on-demand file scanning, \
and a tool for automatic signature updates. The core ClamAV library \
provides numerous file format detection mechanisms, file unpacking \
support, archive support, and multiple signature languages for \
detecting threats."
LICENSE = "GPL-2.0-only"

PV = "0.103.8"

RPM_NAME = "clamav-0.103.8-1.3.aarch64.rpm"
RPM_HASH = "38274366c64814c6f837c1b55c17c2d03e9be88e3131f7d782b30896bdeabe991a135ef72423f096f814628202958f171f13b2620872b8a5e4ab36600d74294d"

RPROVIDES:${PN} += "clamav clamav(aarch-64) clamav-nodb config(clamav)"
RDEPENDS:${PN} += "/bin/sh group(vscan) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libclamav.so.9()(64bit) libclamav.so.9(CLAMAV_PRIVATE)(64bit) libclamav.so.9(CLAMAV_PUBLIC)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libfreshclam.so.2()(64bit) libfreshclam.so.2(FRESHCLAM_PRIVATE)(64bit) libfreshclam.so.2(FRESHCLAM_PUBLIC)(64bit) libjson-c.so.5()(64bit) libjson-c.so.5(JSONC_0.14)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0.2)(64bit) libz.so.1(ZLIB_1.2.3.3)(64bit) user(vscan)"

inherit rpm
