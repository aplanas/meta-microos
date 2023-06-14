SUMMARY = "Development files for libclamav, an antivirus engine"
DESCRIPTION = "ClamAV is an antivirus engine designed for detecting trojans, \
viruses, malware and other malicious threats. \
 \
This subpackage contains header files for developing applications \
that want to make use of libclamav."
LICENSE = "GPL-2.0-only"

PV = "0.103.8"

RPM_NAME = "clamav-devel-0.103.8-1.3.aarch64.rpm"
RPM_HASH = "7531aabecc6478fd61480fc0d6281821816f9ddecfb5c2503ee4189cfd0f7f06da528734f8ab24c616c376bfaf7dc2e725eda030468a42649124fdf0ed9c069d"

RPROVIDES:${PN} += "clamav-devel \
pkgconfig-libclamav"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclamav9 \
libfreshclam2"

inherit rpm
