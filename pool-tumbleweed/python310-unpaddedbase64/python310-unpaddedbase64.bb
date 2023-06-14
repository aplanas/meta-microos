SUMMARY = "Unpadded Base64"
DESCRIPTION = "Encode and decode Base64 without '=' padding. \
 \
RFC 4648 specifies that Base64 should be padded to a multiple of 4 bytes using \
'=' characters. However this conveys no benefit so many protocols choose to use \
Base64 without the '=' padding."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python310-unpaddedbase64-2.1.0-1.10.noarch.rpm"
RPM_HASH = "61063972daccaec86d2fc0ad31ad38eb36a562217b654b7c68b0dbb6ba92e8889edc328779f94b5f795c1d1542239e4692869c94c887994c91b968c395e17b0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unpaddedbase64 \
python3.10dist-unpaddedbase64 \
python310-unpaddedbase64 \
python3dist-unpaddedbase64"

RDEPENDS:${PN} += "python-abi"

inherit rpm
