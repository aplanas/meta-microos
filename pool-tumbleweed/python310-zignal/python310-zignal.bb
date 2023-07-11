SUMMARY = "Audio signal processing library"
DESCRIPTION = "This is a python audio signal processing library."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-zignal-0.6.0-5.6.noarch.rpm"
RPM_HASH = "5cfa237fe77391457e0b47808b0e34b3d7b675d81615698cf652c9a24f54a04ebb3f9aca20ee6fee2d6a1d93c2348d0ff1d00479ac0d907101f9ed728b9c2622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zignal \
python310-zignal \
python3dist-zignal"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-matplotlib \
python310-numpy \
python310-samplerate \
python310-scipy \
update-alternatives"

inherit rpm
