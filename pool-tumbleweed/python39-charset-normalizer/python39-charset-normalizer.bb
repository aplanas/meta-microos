SUMMARY = "Python Universal Charset detector"
DESCRIPTION = "Python Universal Charset detector."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python39-charset-normalizer-3.2.0-1.1.noarch.rpm"
RPM_HASH = "1945d9d5402edf910b3dd19dc4042f8ed975b6c11b05e4c0c549581aed9762c956a094dddc4a7d3e788352d64f7966aa3aa84211d85e7200ce2a77d04ec8165f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-charset-normalizer \
python39-charset-normalizer \
python3dist-charset-normalizer"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
