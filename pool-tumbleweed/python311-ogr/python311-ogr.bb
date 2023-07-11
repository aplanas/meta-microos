SUMMARY = "One API for multiple git forges"
DESCRIPTION = "One API for multiple git forges."
LICENSE = "MIT"

PV = "0.45.0"

RPM_NAME = "python311-ogr-0.45.0-1.1.noarch.rpm"
RPM_HASH = "fce3f6fe89fd0b879837003d937b88053000191c94e472341e59f960cbeb059c640c46a3f076824e0677c2c5c38d4f78f5d5a0aea50936b7d25de74be07f1cc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ogr \
python3.11dist-ogr \
python311-ogr \
python3dist-ogr"

RDEPENDS:${PN} += "python-abi \
python311-Deprecated \
python311-GitPython \
python311-PyGithub \
python311-PyYAML \
python311-cryptography \
python311-python-gitlab \
python311-requests"

inherit rpm
