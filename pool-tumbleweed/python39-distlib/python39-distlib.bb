SUMMARY = "Distribution utilities"
DESCRIPTION = "Python distribution utilities."
LICENSE = "Python-2.0"

PV = "0.3.6"

RPM_NAME = "python39-distlib-0.3.6-2.3.noarch.rpm"
RPM_HASH = "dbbd4cfef667705ce871711fa540a63413cd721237a5897227f3b8c042d10e4a8b760d5198b12b67d2c5e828129cfdbf2913462e28cd6cc327962186febf052e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-distlib \
python39-distlib \
python3dist-distlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
