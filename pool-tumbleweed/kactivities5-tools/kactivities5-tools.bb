SUMMARY = "Command-line tools for Plasma Activity management"
DESCRIPTION = "This package provides command-line tools to manipulate Plasma Activities."
LICENSE = "GPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "kactivities5-tools-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "a9f6f0e5b5d0eaa59538eb59b3a9726361b6cdfbf99fd8743be18ba718e13dd4cfa5e550021f0410bae535c0c5a2a1c54fdcdf04a8db807451b61e384cb674b5"

RPROVIDES:${PN} += "kactivities5-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5Activities5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
