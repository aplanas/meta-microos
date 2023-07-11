SUMMARY = "Unpadded Base64"
DESCRIPTION = "Encode and decode Base64 without '=' padding. \
 \
RFC 4648 specifies that Base64 should be padded to a multiple of 4 bytes using \
'=' characters. However this conveys no benefit so many protocols choose to use \
Base64 without the '=' padding."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python311-unpaddedbase64-2.1.0-2.3.noarch.rpm"
RPM_HASH = "340753bad9c2f7f6e3dc589a0a1e215722fa694290fca92676f9d3344ec811b643cbe9019d0dd4af9be5c95c7fb457563cc981973e70c7481e4222219d92d824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unpaddedbase64 \
python3.11dist-unpaddedbase64 \
python311-unpaddedbase64 \
python3dist-unpaddedbase64"

RDEPENDS:${PN} += "python-abi"

inherit rpm
