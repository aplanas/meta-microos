SUMMARY = "Python module for osdlyrics"
DESCRIPTION = "This package contains python3 module for osdlyrics"
LICENSE = "GPL-3.0-or-later"

PV = "0.5.13"

RPM_NAME = "python3-osdlyrics-0.5.13-1.3.aarch64.rpm"
RPM_HASH = "38978875330883a8a77f0383441d6906c8dae1b99f6a3a21665f61b2a58de38eae26a6ceaaf887f5b4612d4a39c02cf87c91c0c7eab480945a90eb95ef33fab4"

RPROVIDES:${PN} += "python3-osdlyrics"

RDEPENDS:${PN} += "osdlyrics \
python-abi"

inherit rpm
