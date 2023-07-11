SUMMARY = "Bindings for Chromaprint acoustic fingerprinting and the Acoustid API"
DESCRIPTION = "Chromaprint and Acoustid for Python \
 \
Chromaprint and its associated Acoustid Web service make up a \
high-quality, open-source acoustic fingerprinting system. This package provides \
Python bindings for both the fingerprinting algorithm library, which is written \
in C but portable, and the Web service, which provides fingerprint lookups."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python39-pyacoustid-1.2.2-1.6.noarch.rpm"
RPM_HASH = "3b4c01f023d32cf05efdd77abfec6df124e22a45997569c9c7b2cb17b674343b88d9279d57c062270639fb18b7ed0b6ef8e7863c1891d6a5abf192a8af88ce17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyacoustid \
python39-pyacoustid \
python3dist-pyacoustid"

RDEPENDS:${PN} += "python-abi \
python39-audioread \
python39-requests"

inherit rpm
