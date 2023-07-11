SUMMARY = "Unpadded Base64"
DESCRIPTION = "Encode and decode Base64 without '=' padding. \
 \
RFC 4648 specifies that Base64 should be padded to a multiple of 4 bytes using \
'=' characters. However this conveys no benefit so many protocols choose to use \
Base64 without the '=' padding."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python310-unpaddedbase64-2.1.0-2.3.noarch.rpm"
RPM_HASH = "0803b7c60f9fee383e5911f7d5af8271222816b9065b5d685cb7a96760d08321ac588f4f8baf9ac3d0447b6898749add96480fd52ade86c913b4e21a8fdd1bc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-unpaddedbase64 \
python310-unpaddedbase64 \
python3dist-unpaddedbase64"

RDEPENDS:${PN} += "python-abi"

inherit rpm
