SUMMARY = "Human-friendly HSL"
DESCRIPTION = "Human-friendly HSL"
LICENSE = "MIT"

PV = "5.0.3"

RPM_NAME = "python310-hsluv-5.0.3-1.4.noarch.rpm"
RPM_HASH = "73586d7423648cbc8c772c0dead3db902e2cfc665743f1de13bfd454e554031b98407d1762e9580f2448ed8381fbbdf2f49d883f1c8519f095bb25ef85932cd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hsluv \
python310-hsluv \
python3dist-hsluv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
