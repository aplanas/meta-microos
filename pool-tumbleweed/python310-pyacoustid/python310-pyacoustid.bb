SUMMARY = "Bindings for Chromaprint acoustic fingerprinting and the Acoustid API"
DESCRIPTION = "Chromaprint and Acoustid for Python \
 \
Chromaprint and its associated Acoustid Web service make up a \
high-quality, open-source acoustic fingerprinting system. This package provides \
Python bindings for both the fingerprinting algorithm library, which is written \
in C but portable, and the Web service, which provides fingerprint lookups."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python310-pyacoustid-1.2.2-1.4.noarch.rpm"
RPM_HASH = "557c188c53e8c000de9929c13f8d3d84c5e51189c8c1d3deb5361bc09778cb15b987c0c4908a38311faf87694c6350ffd8e6221d4af47d2afef08252187df518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyacoustid \
python3.10dist-pyacoustid \
python310-pyacoustid \
python3dist-pyacoustid"

RDEPENDS:${PN} += "python-abi \
python310-audioread \
python310-requests"

inherit rpm
