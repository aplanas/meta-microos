SUMMARY = "Udev rules for Linux Kernel PPS"
DESCRIPTION = "Udev rules for Linux Kernel PPS."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.0+git.20211122"

RPM_NAME = "pps-udev-0.0.0+git.20211122-1.3.aarch64.rpm"
RPM_HASH = "13698b281207f64e72f61dd197157794e1dc53068fb0e4a6bd7874022a81bf8501b87762cbb25c8bcc89262ba1fd4c4e5e5b06178c1bb906627375c274e7e531"

RPROVIDES:${PN} += "pps-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
user-ntp"

inherit rpm
