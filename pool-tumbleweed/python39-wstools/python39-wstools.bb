SUMMARY = "WSDL parsing services package for Web Services for Python"
DESCRIPTION = "Python module for WSDL parsing services package for Web Services."
LICENSE = "ZPL-2.0"

PV = "0.4.8"

RPM_NAME = "python39-wstools-0.4.8-7.8.noarch.rpm"
RPM_HASH = "bf48f87f9c9d294af054e7e740710b74ca39c209c42a896e6c9b47130e6828f2235f8dbf2584e6a09ebc396f092f751da412d0eb8f806a1a483e8755fc5e6223"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wstools \
python39-wstools \
python3dist-wstools"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
