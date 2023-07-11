SUMMARY = "UFO font processing library"
DESCRIPTION = "ufoLib2 is a UFO font processing library."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python39-ufoLib2-0.13.1-1.5.noarch.rpm"
RPM_HASH = "169d6ba44b60c98e306ef3b042d567d8450769918891680329e8de4138b8f371730a19483a73f2ab935c859ddbcaf760a77821ee2333cd971d794f889fbd2e48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ufolib2 \
python39-ufoLib2 \
python3dist-ufolib2"

RDEPENDS:${PN} += "python-abi \
python39-FontTools \
python39-attrs \
python39-fs"

inherit rpm
