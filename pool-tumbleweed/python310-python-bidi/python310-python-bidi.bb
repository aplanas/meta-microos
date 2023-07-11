SUMMARY = "BiDi layout algorithm"
DESCRIPTION = "A pure python implementation of the BiDi layout algorithm."
LICENSE = "LGPL-3.0-only"

PV = "0.4.2"

RPM_NAME = "python310-python-bidi-0.4.2-3.12.noarch.rpm"
RPM_HASH = "e22435927df56a7ec4c47aa7af1cc2ba50a7c8affea399092fee3876b124a82d8666acf827e4bfcdd82924df6baa0515e5f761e8c85b49f4328c776348c55e1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-bidi \
python310-python-bidi \
python3dist-python-bidi"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-six \
update-alternatives"

inherit rpm
