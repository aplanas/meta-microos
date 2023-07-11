SUMMARY = "Audio signal processing library"
DESCRIPTION = "This is a python audio signal processing library."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-zignal-0.6.0-5.6.noarch.rpm"
RPM_HASH = "d04cfe470c9f48f05dc95cb25ad154dca8c5c3cdd8458b561077ae26d550272d223b9faa8d007cc9660803f30f4377cac865d622fe8646d213c49586573398f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zignal \
python3.11dist-zignal \
python311-zignal \
python3dist-zignal"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-matplotlib \
python311-numpy \
python311-samplerate \
python311-scipy \
update-alternatives"

inherit rpm
