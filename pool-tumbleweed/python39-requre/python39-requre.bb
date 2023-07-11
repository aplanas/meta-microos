SUMMARY = "Python libray for storing and using objects for testing"
DESCRIPTION = "Library for testing python code what allows store output of \
various objects and use stored data for testing."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python39-requre-0.8.2-1.6.noarch.rpm"
RPM_HASH = "73504e0612426e6be3f05c50534879655b51414b477d4a7da7e2595a5e0e529998aff77ccfbfa84ff2554f43aae7ae0c1be29bf9863571984e0a8b54167bf791"
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
python39-requests"

inherit rpm
