SUMMARY = "Reader for the RADEX RD1212 and ONE Geiger counters"
DESCRIPTION = "The RadexReader is an user-space driver for the RADEX RD1212 and \
the RADEX ONE Geiger counters. It allow to read and clear stored \
data via USB. \
 \
To avoid Access denied (insufficient permissions), don't forget \
to unplug the device after installation."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "python39-radexreader-1.2.1-1.9.noarch.rpm"
RPM_HASH = "0534a3981287c3a9ef086f0fa2cdffc09f03db1383a969b62468730c708f04ddd377081a28ef5ea34fde70e089b8301708d6984946f1d2c6b7435deff6b59e9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(radexreader) \
python39-radexreader \
python3dist(radexreader)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-pyserial \
python39-pyusb \
update-alternatives"

inherit rpm
