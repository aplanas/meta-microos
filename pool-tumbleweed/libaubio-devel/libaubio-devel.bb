SUMMARY = "Development package for aubio library"
DESCRIPTION = "This package contains the files needed to compile programs that use \
aubio library."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9"

RPM_NAME = "libaubio-devel-0.4.9-9.1.aarch64.rpm"
RPM_HASH = "7b6798ee67d71609395fc5db1d033b8e74b44f823b298d88006d38dfef45bb78d262b3045f17e7951c500ba4133e2b962d8ea5b21e1e680f45482021432d525f"

RPROVIDES:${PN} += "libaubio-devel \
libaubio-devel(aarch-64) \
pkgconfig(aubio)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libaubio5"

inherit rpm
