SUMMARY = "Python libray for storing and using objects for testing"
DESCRIPTION = "Library for testing python code what allows store output of \
various objects and use stored data for testing."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python310-requre-0.8.2-1.6.noarch.rpm"
RPM_HASH = "ac82e5d7db5d6d2df4a90ba1af77e272ee2ea92e9004775922b013b736487bc947457d2aeb05bf8e381910b6486a4437d19c8b7daf65a39badd686c3206dd0d2"
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
python310-requests"

inherit rpm
