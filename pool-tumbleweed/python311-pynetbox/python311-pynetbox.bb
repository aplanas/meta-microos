SUMMARY = "NetBox API client library"
DESCRIPTION = "Python API client library for NetBox."
LICENSE = "Apache-2.0"

PV = "7.1.0"

RPM_NAME = "python311-pynetbox-7.1.0-1.1.noarch.rpm"
RPM_HASH = "efce3e44e306859a14aeb19e05ea25e708ef6a1f2f49269baaf5ea28f375ce23bc4cdee9151815069ce187439d01cbc021af7c644c1f9a14a63228d2bfdc9a7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pynetbox \
python3.11dist-pynetbox \
python311-pynetbox \
python3dist-pynetbox"

RDEPENDS:${PN} += "python-abi \
python311-packaging \
python311-requests"

inherit rpm
