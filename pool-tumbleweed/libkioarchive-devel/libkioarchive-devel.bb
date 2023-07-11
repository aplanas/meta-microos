SUMMARY = "Development package for libkioarchive5"
DESCRIPTION = "This is the development package for libkioarchive"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libkioarchive-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "7933d05ca3c1f6cacee4e7c014dab5719af373fc7bf181eb777aeface2da764142b24e3a511bc3de01230c15e19192e62692adbf1e8e4c19a5f1354511081f2d"

RPROVIDES:${PN} += "cmake-KioArchive \
libkioarchive-devel"

RDEPENDS:${PN} += "libkioarchive5"

inherit rpm
