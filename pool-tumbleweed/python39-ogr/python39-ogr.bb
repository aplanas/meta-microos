SUMMARY = "One API for multiple git forges"
DESCRIPTION = "One API for multiple git forges."
LICENSE = "MIT"

PV = "0.45.0"

RPM_NAME = "python39-ogr-0.45.0-2.1.noarch.rpm"
RPM_HASH = "1e88e51c965407768df133f6d9684841a7a113938e8b0cd14b367e7fb8a8806cb1f3c96bf0ba104b469df2657ced7ddb84ac293d090d9866149be8d3e9178c5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ogr \
python39-ogr \
python3dist-ogr"

RDEPENDS:${PN} += "python-abi \
python39-Deprecated \
python39-GitPython \
python39-PyGithub \
python39-PyYAML \
python39-cryptography \
python39-python-gitlab \
python39-requests"

inherit rpm
