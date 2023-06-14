SUMMARY = "Unpadded Base64"
DESCRIPTION = "Encode and decode Base64 without '=' padding. \
 \
RFC 4648 specifies that Base64 should be padded to a multiple of 4 bytes using \
'=' characters. However this conveys no benefit so many protocols choose to use \
Base64 without the '=' padding."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python39-unpaddedbase64-2.1.0-1.10.noarch.rpm"
RPM_HASH = "cb2700c6616c7165ab2aea32bd3440eaea75a02ac6696e8e8a9db6bd9c07709efd8eb077f7a41249da01f0ecd0d515664d552a923b683f1f9d66069301ead883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-unpaddedbase64 \
python39-unpaddedbase64 \
python3dist-unpaddedbase64"

RDEPENDS:${PN} += "python-abi"

inherit rpm
