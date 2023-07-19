SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230716"

RPM_NAME = "openSUSE-release-ftp-20230716-1738.1.aarch64.rpm"
RPM_HASH = "a66cd356ef80c83a0a08811c5a0f826cba97c20515e4331972d08a2967536298890a0fec755bb930fbe67b7cf0601d1fe0d60aea21962603a981eb7aa17bf751"

RPROVIDES:${PN} += "flavor-ftp \
openSUSE-release-ftp \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
