SUMMARY = "Audio signal processing library"
DESCRIPTION = "This is a python audio signal processing library."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-zignal-0.6.0-5.4.noarch.rpm"
RPM_HASH = "e21eb9e2ec681ddd6e3633e32ae232c2a926fdd5c70932783189eb0bf6f941613bd72305ed57630dab2222074fd7c9ee4e18a2a51ee30e054af218b9ea40e45d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(zignal) \
python39-zignal \
python3dist(zignal)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-matplotlib \
python39-numpy \
python39-samplerate \
python39-scipy \
update-alternatives"

inherit rpm
