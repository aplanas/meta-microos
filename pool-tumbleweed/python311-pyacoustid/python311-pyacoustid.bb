SUMMARY = "Bindings for Chromaprint acoustic fingerprinting and the Acoustid API"
DESCRIPTION = "Chromaprint and Acoustid for Python \
 \
Chromaprint and its associated Acoustid Web service make up a \
high-quality, open-source acoustic fingerprinting system. This package provides \
Python bindings for both the fingerprinting algorithm library, which is written \
in C but portable, and the Web service, which provides fingerprint lookups."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python311-pyacoustid-1.2.2-1.6.noarch.rpm"
RPM_HASH = "67417892bc89ce36e16a700316205850cfe9cbb2cc91348f944de86d41483d75327765cf498aa3926a0b97fccf12c2b98c59445cffa59e9039ec49755b02632a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyacoustid \
python3.11dist-pyacoustid \
python311-pyacoustid \
python3dist-pyacoustid"

RDEPENDS:${PN} += "python-abi \
python311-audioread \
python311-requests"

inherit rpm
