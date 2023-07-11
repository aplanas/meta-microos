SUMMARY = "Development files for libmirisdr"
DESCRIPTION = "Library headers and other development files for mirisdr driver."
LICENSE = "GPL-2.0"

PV = "0.0.0+git.20130608"

RPM_NAME = "libmirisdr-devel-0.0.0+git.20130608-1.25.aarch64.rpm"
RPM_HASH = "cf3171d9669c61410a8beafe8e4478c17d068e6f86a92567fa045dc3916caa87435f09af46e92b9c5227cd45dd6ad70177c75d316e825f7144ec9210825bb3af"

RPROVIDES:${PN} += "libmirisdr-devel \
pkgconfig-libmirisdr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmirisdr"

inherit rpm
