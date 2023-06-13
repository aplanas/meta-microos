SUMMARY = "Development files for libddcontrol"
DESCRIPTION = "ddccontrol allows to change monitor settings, such as brightness and \
contrast, without using the monitor's hardware buttons."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2+20140105+git9d89d8c"

RPM_NAME = "ddccontrol-devel-0.4.2+20140105+git9d89d8c-4.14.aarch64.rpm"
RPM_HASH = "fadbff0fc2adcde2b671bafb0a9237274b3dedf3beef809a764bdf192e33d8515073bf1311febbd103f03dc01af532f99b56095315d3fb515f23b1a25a1d9cc7"

RPROVIDES:${PN} += "ddccontrol-devel \
ddccontrol-devel(aarch-64) \
pkgconfig(ddccontrol)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libddccontrol0"

inherit rpm
