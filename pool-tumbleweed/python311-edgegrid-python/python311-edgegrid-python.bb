SUMMARY = "Client authentication protocol for python-requests"
DESCRIPTION = "Client authentication protocol for python-requests"
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python311-edgegrid-python-1.2.1-1.10.noarch.rpm"
RPM_HASH = "ed547372a111aac5171295783268cd655c25cafb0738315260a1b5b281bebb94b20f618a39bba0ad734fd8f322fe55a312e689f95c988ab0ba114390501484d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-edgegrid-python \
python3.11dist-edgegrid-python \
python311-edgegrid-python \
python3dist-edgegrid-python"

RDEPENDS:${PN} += "python-abi \
python311-ndg-httpsclient \
python311-pyOpenSSL \
python311-pyasn1 \
python311-requests \
python311-urllib3"

inherit rpm
