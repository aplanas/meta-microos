SUMMARY = "Reader for the RADEX RD1212 and ONE Geiger counters"
DESCRIPTION = "The RadexReader is an user-space driver for the RADEX RD1212 and \
the RADEX ONE Geiger counters. It allow to read and clear stored \
data via USB. \
 \
To avoid Access denied (insufficient permissions), don't forget \
to unplug the device after installation."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.2"

RPM_NAME = "python39-radexreader-1.2.2-2.1.noarch.rpm"
RPM_HASH = "76e11b59d95de01a268590db693c7a6853dbb2143ad19b88c3a66713c53cb0aeaafea0ff1644f171fef3d0099c41868bea8827137663b13c5888bfae3d3f8df2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-radexreader \
python39-radexreader \
python3dist-radexreader"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-pyserial \
python39-pyusb \
update-alternatives"

inherit rpm
