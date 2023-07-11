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

RPM_NAME = "clamav-0.103.8-1.4.aarch64.rpm"
RPM_HASH = "5aba64d998b9cdc3cb21b674c5b23f67ea49ba752f8cd7ae74ebc5f720e365f33bf377ee24f5e79d09b241a60e8faf8542c662c3a36db0db6069ce432fe653a3"

RPROVIDES:${PN} += "clamav \
clamav-nodb \
config-clamav"

RDEPENDS:${PN} += "/usr/bin/sh \
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
