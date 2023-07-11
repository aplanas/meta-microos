SUMMARY = "Human-friendly HSL"
DESCRIPTION = "Human-friendly HSL"
LICENSE = "MIT"

PV = "5.0.3"

RPM_NAME = "python39-hsluv-5.0.3-1.4.noarch.rpm"
RPM_HASH = "0803466079d8bb4d10b6cc6667f97ac07696410c7e9ca68faeaa7abdbafefcde74e30986badd62601db0ec49b2a2185d2032456c70ec50b90a524c27825ff046"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hsluv \
python39-hsluv \
python3dist-hsluv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
