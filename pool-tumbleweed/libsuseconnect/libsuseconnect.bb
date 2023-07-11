SUMMARY = "C interface to suseconnect-ng"
DESCRIPTION = "This package contains library which provides C interface to selected \
suseconnect-ng functions."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0~git2.f42b4b2a060e"

RPM_NAME = "libsuseconnect-1.1.0~git2.f42b4b2a060e-1.1.aarch64.rpm"
RPM_HASH = "b9d0568afc2108823b1940b5d44299d0f91440be4c817090fe6a86aaa22ef9c0332f0bdaee2ff4640f2f85fc03c470b3a1ef37f5a40e0243cf3a6913bafb7ad5"

RPROVIDES:${PN} += "libsuseconnect"

RDEPENDS:${PN} += "suseconnect-ng"

inherit rpm
