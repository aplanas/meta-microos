SUMMARY = "Development files for airspy"
DESCRIPTION = "Library headers for airspy driver."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.10"

RPM_NAME = "airspy-devel-1.0.10-1.8.aarch64.rpm"
RPM_HASH = "06ca555864f45c3adce9c906f272bdcf11e35161d76469cb9023dcab900e614447622300d6becb4786d83491fad5cf8fa2fdc994a76315d35179efe69906a278"

RPROVIDES:${PN} += "airspy-devel \
airspy-devel(aarch-64) \
pkgconfig(libairspy)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libairspy0"

inherit rpm
