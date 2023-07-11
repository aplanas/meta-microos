SUMMARY = "Hankel Transformations using method of Ogata 2005"
DESCRIPTION = "Hankel is a Python library to perform simple and accurate Hankel \
transformations using the method of Ogata 2005."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python310-hankel-1.2.1-2.5.noarch.rpm"
RPM_HASH = "8d984cafb3059871f517194eb3c16fe4476128b8fe744b93b0d9c2ee8c3ed0965c65dd692de1c76b8e7d694e0eb1a36a4861e2de1f9cc8526ce6ac6f1e63e257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hankel \
python310-hankel \
python3dist-hankel"

RDEPENDS:${PN} += "python-abi \
python310-mpmath \
python310-numpy \
python310-scipy"

inherit rpm
