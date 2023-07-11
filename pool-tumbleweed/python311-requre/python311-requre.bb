SUMMARY = "Python libray for storing and using objects for testing"
DESCRIPTION = "Library for testing python code what allows store output of \
various objects and use stored data for testing."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python311-requre-0.8.2-1.6.noarch.rpm"
RPM_HASH = "1d2ddd1dab5a503dd816e5b32f9a79df95ea464e46362d26c8ffc5ae0d2071a0847c0f592adfa2b15fa9552305f19dceeb0cb91843c8bddaf9072b62595b3352"
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
python311-requests"

inherit rpm
