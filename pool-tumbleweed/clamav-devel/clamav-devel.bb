SUMMARY = "Development files for libclamav, an antivirus engine"
DESCRIPTION = "ClamAV is an antivirus engine designed for detecting trojans, \
viruses, malware and other malicious threats. \
 \
This subpackage contains header files for developing applications \
that want to make use of libclamav."
LICENSE = "GPL-2.0-only"

PV = "0.103.8"

RPM_NAME = "clamav-devel-0.103.8-1.4.aarch64.rpm"
RPM_HASH = "7132edb47aee390899d7fb0f38db3283bafd6cb708ade7c5a2acdcf0dac6bc0ff96cbe65c0d494c8fdd06302e70ff7f25b44a7735b9a8f4d69941171b347e39e"

RPROVIDES:${PN} += "clamav-devel \
pkgconfig-libclamav"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclamav9 \
libfreshclam2"

inherit rpm
