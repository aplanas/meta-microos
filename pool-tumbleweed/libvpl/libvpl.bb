SUMMARY = "oneAPI Video Processing Library (oneVPL) dispatcher, tools, and examples"
DESCRIPTION = "The oneAPI Video Processing Library (oneVPL) provides a single video processing \
API for encode, decode, and video processing that works across a wide range of \
accelerators."
LICENSE = "MIT"

PV = "2023.2.0"

RPM_NAME = "libvpl-2023.2.0-1.1.aarch64.rpm"
RPM_HASH = "bf504ee4d94229573e455fde0fc372e6f388edddb1904b415dabfdf33d48cbf095fd4aeabf665f460a051ec5d62a3ec2369dd9785464df02624f489efa74b49a"

RPROVIDES:${PN} += "libvpl"

RDEPENDS:${PN} += ""

inherit rpm
