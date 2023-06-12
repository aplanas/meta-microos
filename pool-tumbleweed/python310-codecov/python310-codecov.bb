SUMMARY = "Hosted coverage reports"
DESCRIPTION = "Hosted coverage reports for Github, Bitbucket and Gitlab."
LICENSE = "Apache-2.0"

PV = "2.1.13"

RPM_NAME = "python310-codecov-2.1.13-1.1.noarch.rpm"
RPM_HASH = "edc52d4fdd30078e0a71ffd508456e0b8b980e1972404b599555a02a4fffb3d16bafcccad6e110ddb871c268bf7511460beffc7513abd16096a4cbd7213d4e81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-codecov \
python3.10dist(codecov) \
python310-codecov \
python3dist(codecov)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-coverage \
python310-requests \
update-alternatives"

inherit rpm
