SUMMARY = "Python libray for storing and using objects for testing"
DESCRIPTION = "Library for testing python code what allows store output of \
various objects and use stored data for testing."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python310-requre-0.8.2-1.5.noarch.rpm"
RPM_HASH = "7cbd1669348a16eaf7b7f46a7f61965b7bdf1fd206f4dd57786bfc91a18a913553438c88f7bc57433214da9395bcc28d1c7f0b0825eba9452b026c5347c39f0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requre \
python3.10dist(requre) \
python310-requre \
python3dist(requre)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-GitPython \
python310-PyYAML \
python310-click \
python310-requests"

inherit rpm
