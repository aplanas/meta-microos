SUMMARY = "Enhanced Python builtin doctest module"
DESCRIPTION = "A rewrite of the builtin doctest module with a pytest plugin."
LICENSE = "Apache-2.0"

PV = "0.15.10"

RPM_NAME = "python39-xdoctest-0.15.10-1.11.noarch.rpm"
RPM_HASH = "c34e8808b7906ad0878a1072f7bdcbd35a299d1a1ca1ccb736282f849f98522b5b8d06012c641b1ab7524a90e70acebdebce90c03d982676142da0d61692e17f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xdoctest \
python39-xdoctest \
python3dist-xdoctest"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-six \
update-alternatives"

inherit rpm
