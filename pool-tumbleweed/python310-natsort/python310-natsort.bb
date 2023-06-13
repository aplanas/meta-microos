SUMMARY = "Natural sorting in Python"
DESCRIPTION = "Natsort provides a function natsorted that helps sort lists \
'naturally' ('naturally' is rather ill-defined, but in general it means \
sorting based on meaning and not computer code point)."
LICENSE = "MIT"

PV = "8.2.0"

RPM_NAME = "python310-natsort-8.2.0-1.4.noarch.rpm"
RPM_HASH = "0427a0bd8aa906bf1f894576184b206f6db89504d60e1c3dcb836dc92c4bed1a863b6ac0f857cefcbf5239871cd083e35c9b011cfe1b0060a555c1577692fab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-natsort \
python3.10dist(natsort) \
python310-natsort \
python3dist(natsort)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-setuptools \
update-alternatives"

inherit rpm
