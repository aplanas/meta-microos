SUMMARY = "Bindings for Chromaprint acoustic fingerprinting and the Acoustid API"
DESCRIPTION = "Chromaprint and Acoustid for Python \
 \
Chromaprint and its associated Acoustid Web service make up a \
high-quality, open-source acoustic fingerprinting system. This package provides \
Python bindings for both the fingerprinting algorithm library, which is written \
in C but portable, and the Web service, which provides fingerprint lookups."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python39-pyacoustid-1.2.2-1.4.noarch.rpm"
RPM_HASH = "2a624443cf0e7c1ec93065061de96fadb453e63dc31305764e08275623f490a3f3ce7cabf382d278ac9522cf15fc98702a0519b0f6c072ec10383d767f41d59f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyacoustid \
python39-pyacoustid \
python3dist-pyacoustid"

RDEPENDS:${PN} += "python-abi \
python39-audioread \
python39-requests"

inherit rpm
