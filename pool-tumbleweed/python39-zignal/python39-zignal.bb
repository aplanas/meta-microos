SUMMARY = "Audio signal processing library"
DESCRIPTION = "This is a python audio signal processing library."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-zignal-0.6.0-5.6.noarch.rpm"
RPM_HASH = "844cfacec129e06266fdd90256e97085b66bafa6dff8ea2a3f4c2eff994a70fb4fdca275792ebf9e9f326025c81e7df04cf9a01899522e27f5aa07bf59616f3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zignal \
python39-zignal \
python3dist-zignal"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-matplotlib \
python39-numpy \
python39-samplerate \
python39-scipy \
update-alternatives"

inherit rpm
