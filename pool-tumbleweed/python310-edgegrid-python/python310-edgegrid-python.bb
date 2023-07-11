SUMMARY = "Client authentication protocol for python-requests"
DESCRIPTION = "Client authentication protocol for python-requests"
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python310-edgegrid-python-1.2.1-1.10.noarch.rpm"
RPM_HASH = "1201b4b73603b0dedaf74ef77f251b4b10c0b38a3f14c80172611a09d4e97445073a0bfe6d1f4c54e9240773dedc89ddf3b521a260af13db44af84a6b9ca051b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-edgegrid-python \
python310-edgegrid-python \
python3dist-edgegrid-python"

RDEPENDS:${PN} += "python-abi \
python310-ndg-httpsclient \
python310-pyOpenSSL \
python310-pyasn1 \
python310-requests \
python310-urllib3"

inherit rpm
