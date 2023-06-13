SUMMARY = "Unpadded Base64"
DESCRIPTION = "Encode and decode Base64 without '=' padding. \
 \
RFC 4648 specifies that Base64 should be padded to a multiple of 4 bytes using \
'=' characters. However this conveys no benefit so many protocols choose to use \
Base64 without the '=' padding."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python311-unpaddedbase64-2.1.0-1.10.noarch.rpm"
RPM_HASH = "a2464315985acfa292730b659a2d0855b44e24f57531538776aaeb5e670f574acd6c7d19f5d20087501c9009087b4320c13c561899635fc169f826224da7f42a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(unpaddedbase64) \
python311-unpaddedbase64 \
python3dist(unpaddedbase64)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
