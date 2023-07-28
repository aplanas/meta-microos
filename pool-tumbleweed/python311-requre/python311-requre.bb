SUMMARY = "Python libray for storing and using objects for testing"
DESCRIPTION = "Library for testing python code what allows store output of \
various objects and use stored data for testing."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python311-requre-0.8.2-2.1.noarch.rpm"
RPM_HASH = "396aa3b73a481754f122a65198acf5710a516cafe2060088153e2caea8164715cd26104b63a492000134fdb10ff8959a1d736aebe622d96360ce080e95468c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requre \
python3.11dist-requre \
python311-requre \
python3dist-requre"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-GitPython \
python311-PyYAML \
python311-click \
python311-requests \
update-alternatives"

inherit rpm
