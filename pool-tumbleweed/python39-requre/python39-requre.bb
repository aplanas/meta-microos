SUMMARY = "Python libray for storing and using objects for testing"
DESCRIPTION = "Library for testing python code what allows store output of \
various objects and use stored data for testing."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python39-requre-0.8.2-2.1.noarch.rpm"
RPM_HASH = "da79fa2811bf03a5f7c268a656d73fb32fc7fd394ecc321a5abed489dc7bccc6cb3c4d49a6ecf48d008adc04b80d0fd90f14918aa58b9bbdbd68744ee95d8d52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requre \
python39-requre \
python3dist-requre"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-GitPython \
python39-PyYAML \
python39-click \
python39-requests \
update-alternatives"

inherit rpm
