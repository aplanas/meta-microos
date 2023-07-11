SUMMARY = "Unpadded Base64"
DESCRIPTION = "Encode and decode Base64 without '=' padding. \
 \
RFC 4648 specifies that Base64 should be padded to a multiple of 4 bytes using \
'=' characters. However this conveys no benefit so many protocols choose to use \
Base64 without the '=' padding."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python39-unpaddedbase64-2.1.0-2.3.noarch.rpm"
RPM_HASH = "d38a2d9a4f3633c55aaf591a6689a0d068c5233a5a2a2a7916e66a357824f4f43362a404113584995b081380a8b02297cf4b1c6b8a7d4fb68231c2a7eca12fa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-unpaddedbase64 \
python39-unpaddedbase64 \
python3dist-unpaddedbase64"

RDEPENDS:${PN} += "python-abi"

inherit rpm
