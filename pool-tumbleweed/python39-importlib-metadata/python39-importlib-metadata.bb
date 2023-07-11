SUMMARY = "Read metadata from Python packages"
DESCRIPTION = "This package supplies third-party access to the functionality of \
importlib.metadata including improvements added to subsequent Python versions."
LICENSE = "Apache-2.0"

PV = "6.6.0"

RPM_NAME = "python39-importlib-metadata-6.6.0-1.3.noarch.rpm"
RPM_HASH = "cfa03eadc6bed17734d0ba0fca9b53b2df859b12bc1877655c08ec1e76786bd8a9cf14b5c6774a02786e3c7d29a606c60c9ac59658bcf8940098b051450de211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-importlib-metadata \
python39-importlib-metadata \
python3dist-importlib-metadata"

RDEPENDS:${PN} += "python-abi \
python39-zipp"

inherit rpm
