SUMMARY = "WSDL parsing services package for Web Services for Python"
DESCRIPTION = "Python module for WSDL parsing services package for Web Services."
LICENSE = "ZPL-2.0"

PV = "0.4.8"

RPM_NAME = "python311-wstools-0.4.8-7.8.noarch.rpm"
RPM_HASH = "00094a9452752f1e5dd7eb6c468d4c3056a16c1d5c4a41e090f3fbd01575b519a482d09d26eed23b32aff25874f8a664ed990f7c98afc23e4f8c2e85f9c44d77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wstools \
python3.11dist-wstools \
python311-wstools \
python3dist-wstools"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
