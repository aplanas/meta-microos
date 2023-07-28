SUMMARY = "Python libray for storing and using objects for testing"
DESCRIPTION = "Library for testing python code what allows store output of \
various objects and use stored data for testing."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python310-requre-0.8.2-2.1.noarch.rpm"
RPM_HASH = "e58d5e5e27f55a1727d7563385fe853ae6a7bd7c8e2ef75532b2f8dae803e264e41653ca277817bb61db6400372d190d0dcf8df809a9e55dd2bb3cee218535a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requre \
python310-requre \
python3dist-requre"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-GitPython \
python310-PyYAML \
python310-click \
python310-requests \
update-alternatives"

inherit rpm
