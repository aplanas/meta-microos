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

PV = "0.103.9"

RPM_NAME = "clamav-0.103.9-1.1.aarch64.rpm"
RPM_HASH = "7695ff3254bf48825497d16d8ea2bcccd3ccc537f96da32711654e860ab9abdc6e9d984282109664d03d3ce130854338662b15c15241b63fb43bca8f8ed23fce"

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
