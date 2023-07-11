SUMMARY = "Compact C Type Format library (runtime, no BFD dependency)"
DESCRIPTION = "This package includes the libctf-nobfd shared library. \
The Compact C Type Format (CTF) is a way of representing information about a binary program"
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "libctf-nobfd0-2.40-5.3.aarch64.rpm"
RPM_HASH = "0bd6a8053682ec6f351d3b6a588053c2932d0e3a605aef3586e5877cc67f1f24b18c5dca0de81504b08e808802ab7f156e67bedfa72b28a9cbeaf80111ccbfe5"

RPROVIDES:${PN} += "libctf-nobfd.so.0 \
libctf-nobfd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
