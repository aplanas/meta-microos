SUMMARY = "WSDL parsing services package for Web Services for Python"
DESCRIPTION = "Python module for WSDL parsing services package for Web Services."
LICENSE = "ZPL-2.0"

PV = "0.4.8"

RPM_NAME = "python310-wstools-0.4.8-7.6.noarch.rpm"
RPM_HASH = "405b4bec02414def278bdf2778962632688715adeae0c70048d88c002bdb7e2b80c6340a1bca17cc3c1cd69b462967ff97dcd6d9604e9f219b281e59cc830da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wstools \
python3.10dist-wstools \
python310-wstools \
python3dist-wstools"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
