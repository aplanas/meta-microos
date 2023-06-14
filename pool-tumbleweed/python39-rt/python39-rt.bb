SUMMARY = "Python interface to Request Tracker API"
DESCRIPTION = "Python implementation of Request Tracker (a ticketing system) REST API described here: https://rt-wiki.bestpractical.com/wiki/REST"
LICENSE = "GPL-3.0-only"

PV = "3.0.4"

RPM_NAME = "python39-rt-3.0.4-1.4.noarch.rpm"
RPM_HASH = "d321f591d74723f5a1d42bed1a2b8c6f32e286d880788114e663b04977c378c095137d52c21010f5566b3439683446d16d1a191af0b9909b4de1e7ee6064a553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rt \
python39-rt \
python3dist-rt"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-six"

inherit rpm
