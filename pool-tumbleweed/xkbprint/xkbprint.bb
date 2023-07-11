SUMMARY = "Utility to print an XKB keyboard description"
DESCRIPTION = "xkbprint generates a printable or encapsulated PostScript description \
of an XKB keyboard description."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "xkbprint-1.0.6-1.3.aarch64.rpm"
RPM_HASH = "70bdcda910007357431ebb21a2643376ec882dd59d94a2f5d0ef88ecc22a493a427b5680adb661746d6908f4e91ae803b3714edf36f9864cb4965a05bf065217"

RPROVIDES:${PN} += "xkbprint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libxkbfile.so.1"

inherit rpm
