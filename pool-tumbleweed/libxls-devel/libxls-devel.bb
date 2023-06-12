SUMMARY = "Header files for libxls"
DESCRIPTION = "Development files for libxls."
LICENSE = "BSD-2-Clause"

PV = "1.6.2"

RPM_NAME = "libxls-devel-1.6.2-3.5.aarch64.rpm"
RPM_HASH = "472d796bf8571b4f97ae90f78c0bf9843b7db38ab303798befdd484ee689083b01340833c87516419d9541a0f07c764efc8ff95532957f5be1b95e1a92fd470a"

RPROVIDES:${PN} += "libxls-devel \
libxls-devel(aarch-64) \
pkgconfig(libxls)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxlsreader8"

inherit rpm
