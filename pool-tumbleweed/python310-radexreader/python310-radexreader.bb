SUMMARY = "Reader for the RADEX RD1212 and ONE Geiger counters"
DESCRIPTION = "The RadexReader is an user-space driver for the RADEX RD1212 and \
the RADEX ONE Geiger counters. It allow to read and clear stored \
data via USB. \
 \
To avoid Access denied (insufficient permissions), don't forget \
to unplug the device after installation."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.2"

RPM_NAME = "python310-radexreader-1.2.2-2.1.noarch.rpm"
RPM_HASH = "9d838c00696291be335037b61fb9571c07e8b6cab5c99652f7ca6eb9347970adc5e4bc9c313affb149d4dc03d5ded16fda134c4c0f33b42c9b8e5ead9a8a92c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-radexreader \
python310-radexreader \
python3dist-radexreader"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pyserial \
python310-pyusb \
update-alternatives"

inherit rpm
