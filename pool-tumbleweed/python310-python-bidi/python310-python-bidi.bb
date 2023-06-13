SUMMARY = "BiDi layout algorithm"
DESCRIPTION = "A pure python implementation of the BiDi layout algorithm."
LICENSE = "LGPL-3.0-only"

PV = "0.4.2"

RPM_NAME = "python310-python-bidi-0.4.2-3.11.noarch.rpm"
RPM_HASH = "da5ad470d96b8ea3f57ffe7b6fc2935458ad405920883ebc2a76e735fe495d06674a687fd2ae1f19f5f82e5cd090c79edb3ae20144ee64f183ccc0e33eaaf004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-bidi \
python3.10dist(python-bidi) \
python310-python-bidi \
python3dist(python-bidi)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-six \
update-alternatives"

inherit rpm
