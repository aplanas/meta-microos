SUMMARY = "A small python module for wake on lan"
DESCRIPTION = "A small python module for wake on lan."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-wakeonlan-3.0.0-1.1.noarch.rpm"
RPM_HASH = "0c6a0a5a9c3383766ea6959fedbc052e668152448c42d68e5790cbed2dc4ed63b8c491ba4c798bbaee05bd7b2093a2cd71b84e90945b2140a0a3cda4b6ac6162"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wakeonlan \
python39-wakeonlan \
python3dist-wakeonlan"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
update-alternatives"

inherit rpm
