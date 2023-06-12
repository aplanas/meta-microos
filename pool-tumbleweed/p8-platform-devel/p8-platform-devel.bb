SUMMARY = "Platform support library used by libCEC development files"
DESCRIPTION = "Development files for platform support library used by libCEC and Kodi."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.0.1"

RPM_NAME = "p8-platform-devel-2.1.0.1-3.13.aarch64.rpm"
RPM_HASH = "eecfdd1e2ef17a71e7af3698e8e55cf649b1ea2b65cced43ac03ee1995ba74bfc3b77f1d08322767e508bc442991b8761cfcb3798be559966d33d5a82b0b5a07"

RPROVIDES:${PN} += "p8-platform-devel \
p8-platform-devel(aarch-64) \
pkgconfig(p8-platform)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libp8-platform2"

inherit rpm
