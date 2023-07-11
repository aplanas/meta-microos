SUMMARY = "Pure Python implementation of the Gwyddion file format"
DESCRIPTION = "Pure Python implementation of the Gwyddion file format."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-gwyfile-0.2.0-2.11.noarch.rpm"
RPM_HASH = "8741d6fe95d43ea901a76812f91859d0cc276873cb5934b3c3248e9b5c133d9c4e3802cacb23002a67eee05c7be344e59a7d378353d797c0a6e112c1828b9ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gwyfile \
python3.11dist-gwyfile \
python311-gwyfile \
python3dist-gwyfile"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-six"

inherit rpm
