SUMMARY = "Bindings for Chromaprint acoustic fingerprinting and the Acoustid API"
DESCRIPTION = "Chromaprint and Acoustid for Python \
 \
Chromaprint and its associated Acoustid Web service make up a \
high-quality, open-source acoustic fingerprinting system. This package provides \
Python bindings for both the fingerprinting algorithm library, which is written \
in C but portable, and the Web service, which provides fingerprint lookups."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python310-pyacoustid-1.2.2-1.6.noarch.rpm"
RPM_HASH = "e496ce0f14d2b3fc8c343dbce0b5ad15b3ffab881d1cf9232990e2866de7f5b32f26cccee0e8fc6d418b0e5740c895df2027b5915af9d78e88533111865593d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyacoustid \
python310-pyacoustid \
python3dist-pyacoustid"

RDEPENDS:${PN} += "python-abi \
python310-audioread \
python310-requests"

inherit rpm
