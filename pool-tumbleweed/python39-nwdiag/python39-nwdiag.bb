SUMMARY = "Generator for network diagram images from text"
DESCRIPTION = "nwdiag generates network diagram images from text."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python39-nwdiag-3.0.0-1.5.noarch.rpm"
RPM_HASH = "198276aec50062894242635b90bbcb4b1dfddafd354ed8163c0bd895120a47fa350c99b185956184cdaab045b7b9b8b7ea04c2caf933d3f8ded954c694482c1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nwdiag) \
python39-nwdiag \
python3dist(nwdiag)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-blockdiag \
python39-setuptools \
update-alternatives"

inherit rpm
