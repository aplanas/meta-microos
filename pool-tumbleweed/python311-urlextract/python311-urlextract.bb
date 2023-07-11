SUMMARY = "Collects and extracts URLs from given text"
DESCRIPTION = "Collects and extracts URLs from given text."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python311-urlextract-1.7.1-1.6.noarch.rpm"
RPM_HASH = "b2e0c4cb5c930c73568adce58630c9e1b0556d7c67dac9eb65feef93b39cb881fd59575ada96bef6c860f336ebf4d383dc6b0106eabaa40f2b10a499f5a516dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-urlextract \
python3.11dist-urlextract \
python311-urlextract \
python3dist-urlextract"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-dnspython \
python311-filelock \
python311-idna \
python311-platformdirs \
python311-uritools \
update-alternatives"

inherit rpm
