SUMMARY = "Development files for libclamav, an antivirus engine"
DESCRIPTION = "ClamAV is an antivirus engine designed for detecting trojans, \
viruses, malware and other malicious threats. \
 \
This subpackage contains header files for developing applications \
that want to make use of libclamav."
LICENSE = "GPL-2.0-only"

PV = "0.103.9"

RPM_NAME = "clamav-devel-0.103.9-1.1.aarch64.rpm"
RPM_HASH = "e8c2f741c1e5b2a0fa395455f3c0de7ac6053e0b965077a5fd8e6946a651200f5e5a7aa210f54bce56102759bb35e1f0b395fd457581bebdc7df28f09b893f85"

RPROVIDES:${PN} += "clamav-devel \
pkgconfig-libclamav"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclamav9 \
libfreshclam2"

inherit rpm
