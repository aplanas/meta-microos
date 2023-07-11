SUMMARY = "Python interface to Request Tracker API"
DESCRIPTION = "Python implementation of Request Tracker (a ticketing system) REST API described here: https://rt-wiki.bestpractical.com/wiki/REST"
LICENSE = "GPL-3.0-only"

PV = "3.0.4"

RPM_NAME = "python310-rt-3.0.4-1.5.noarch.rpm"
RPM_HASH = "73eeb2139b93aa8d1b1d88221ab4ab85e9caa3e5834aa304b10578d19c164aa85fe2208cd524ee101347afe26386ccbab3536115cde30cd4dbb8c5c1f54ac7d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rt \
python310-rt \
python3dist-rt"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-six"

inherit rpm
