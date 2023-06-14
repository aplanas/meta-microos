SUMMARY = "Header files for MATE's dictionary library"
DESCRIPTION = "The matedict library is an engine to look up words in dictionary sources. \
This package contains development files for libmatedict."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "libmatedict-devel-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "7b677590f13153f29e8f97d4a37e9ca2579b7848eb559c5acec808c13d49eb81203778162238b3c7cee82bf2b68c971b042eeb696aa98473ff47908262d18fdf"

RPROVIDES:${PN} += "libmatedict-devel \
pkgconfig-mate-dict"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmatedict6 \
pkgconfig-gtk+-3.0"

inherit rpm
