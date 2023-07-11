SUMMARY = "Python module for osdlyrics"
DESCRIPTION = "This package contains python3 module for osdlyrics"
LICENSE = "GPL-3.0-or-later"

PV = "0.5.13"

RPM_NAME = "python3-osdlyrics-0.5.13-1.4.aarch64.rpm"
RPM_HASH = "34d4d68aff4baa96db6c25e2f1c62be5995742708d3b53d0614343c6727fad2d231683d9b35910c2fa8b199e9cb27c8ab472660d19ec54e27dc31900d8efb67c"

RPROVIDES:${PN} += "python3-osdlyrics"

RDEPENDS:${PN} += "osdlyrics \
python-abi"

inherit rpm
