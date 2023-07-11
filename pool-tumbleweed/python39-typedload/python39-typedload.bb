SUMMARY = "Load and dump data from json-like format into typed data structures"
DESCRIPTION = "Load and dump data from json-like format into typed data structures"
LICENSE = "GPL-3.0-only"

PV = "2.19"

RPM_NAME = "python39-typedload-2.19-1.5.noarch.rpm"
RPM_HASH = "fdb6c909e383fb1f33a3503bc2ba228946bec98c7b530e7fbc006cd7b5c28414abc492883964985fff9f4a653d849aa7455dfcfe39d0f8a270c6021211ee9633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-typedload \
python39-typedload \
python3dist-typedload"

RDEPENDS:${PN} += "python-abi"

inherit rpm
