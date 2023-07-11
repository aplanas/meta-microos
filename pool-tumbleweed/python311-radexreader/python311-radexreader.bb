SUMMARY = "Reader for the RADEX RD1212 and ONE Geiger counters"
DESCRIPTION = "The RadexReader is an user-space driver for the RADEX RD1212 and \
the RADEX ONE Geiger counters. It allow to read and clear stored \
data via USB. \
 \
To avoid Access denied (insufficient permissions), don't forget \
to unplug the device after installation."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.2"

RPM_NAME = "python311-radexreader-1.2.2-2.1.noarch.rpm"
RPM_HASH = "c04a03b27d00a360c1f5e3f3c27f338429603d108e7d9d393a538ff6fc992e47bdb02848d61d9724a600f4c0ff965484010d0647aa6c0cd8c8a3f5744727fcf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-radexreader \
python3.11dist-radexreader \
python311-radexreader \
python3dist-radexreader"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pyserial \
python311-pyusb \
update-alternatives"

inherit rpm
