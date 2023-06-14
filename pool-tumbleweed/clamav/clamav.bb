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

RPROVIDES:${PN} += "clamav \
clamav-nodb \
config-clamav"

RDEPENDS:${PN} += "/bin/sh \
group-vscan \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclamav.so.9 \
libcrypto.so.3 \
libcurl.so.4 \
libfreshclam.so.2 \
libjson-c.so.5 \
libncurses.so.6 \
libtinfo.so.6 \
libz.so.1 \
user-vscan"

inherit rpm
