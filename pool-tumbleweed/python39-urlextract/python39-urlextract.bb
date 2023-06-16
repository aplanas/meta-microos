SUMMARY = "Collects and extracts URLs from given text"
DESCRIPTION = "Collects and extracts URLs from given text."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python39-urlextract-1.7.1-1.4.noarch.rpm"
RPM_HASH = "8eb9b261bd74c2c9874b349c45e07785da013a5a61664f22f621a9d9e0530369f03834eda33c476f2a3f8f039d46993837e5afd162199eea272d909ef56512df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-urlextract \
python39-urlextract \
python3dist-urlextract"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-dnspython \
python39-filelock \
python39-idna \
python39-platformdirs \
python39-uritools \
update-alternatives"

inherit rpm
