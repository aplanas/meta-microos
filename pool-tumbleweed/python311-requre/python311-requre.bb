SUMMARY = "Python libray for storing and using objects for testing"
DESCRIPTION = "Library for testing python code what allows store output of \
various objects and use stored data for testing."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python311-requre-0.8.2-1.5.noarch.rpm"
RPM_HASH = "5fa35265f545d2596a9358230af9a602dd376bcf058cec857b27b7688c7e3c1e2b9eca63d89d3d14184e2e8e239ff542ea823aaefb76c99dddf9ac5aeb3ad734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-requre \
python311-requre \
python3dist-requre"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-GitPython \
python311-PyYAML \
python311-click \
python311-requests"

inherit rpm
