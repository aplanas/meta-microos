SUMMARY = "A small python module for wake on lan"
DESCRIPTION = "A small python module for wake on lan."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-wakeonlan-3.0.0-1.1.noarch.rpm"
RPM_HASH = "8a91317bbc472e6f05ae5c57bdd17a5b320a27b0361098a7bf9c858486833701ec6f15c78ba006cedfc5c710f18d17d7afd021c287b55f7243e15fabfeda01a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(wakeonlan) \
python311-wakeonlan \
python3dist(wakeonlan)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
