SUMMARY = "Reader for the RADEX RD1212 and ONE Geiger counters"
DESCRIPTION = "The RadexReader is an user-space driver for the RADEX RD1212 and \
the RADEX ONE Geiger counters. It allow to read and clear stored \
data via USB. \
 \
To avoid Access denied (insufficient permissions), don't forget \
to unplug the device after installation."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "python310-radexreader-1.2.1-1.9.noarch.rpm"
RPM_HASH = "402e234fc64712e78581a20ead5d2069b0c57edd80cbbff02b10d0a9a645d12051a12f0c566ead884842b072ecbd5f2b58845dc66152b79e4a40532d20193149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-radexreader \
python3.10dist(radexreader) \
python310-radexreader \
python3dist(radexreader)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-pyserial \
python310-pyusb \
update-alternatives"

inherit rpm
