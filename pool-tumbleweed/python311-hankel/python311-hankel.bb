SUMMARY = "Hankel Transformations using method of Ogata 2005"
DESCRIPTION = "Hankel is a Python library to perform simple and accurate Hankel \
transformations using the method of Ogata 2005."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python311-hankel-1.2.1-2.3.noarch.rpm"
RPM_HASH = "440ed6a145c142bff4c60e271ba0101aa36430d7a73874657213af1a0e5f56cdcd0d2bd993f42d0a361fa5cabfccb323b49b8e41782057cba71a91cd35c3c5f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hankel) \
python311-hankel \
python3dist(hankel)"

RDEPENDS:${PN} += "python(abi) \
python311-mpmath \
python311-numpy \
python311-scipy"

inherit rpm
