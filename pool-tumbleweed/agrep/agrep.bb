SUMMARY = "Another powerful grep with interesting features"
DESCRIPTION = "agrep is another powerful grep which has the  ability to search for \
approximate patterns as well as block oriented search."
LICENSE = "BSD-3-Clause"

PV = "0.8.0_git201402282055"

RPM_NAME = "agrep-0.8.0_git201402282055-7.2.aarch64.rpm"
RPM_HASH = "171c6ccad0bc549374c46ab428609a6f4714be0ecb48a49193d3e0a87e5a91487d7447440d783a34768823c237895e96cb21e793e5d36b49abda169c15f9b0d6"

RPROVIDES:${PN} += "agrep \
agrep(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libtre.so.5()(64bit)"

inherit rpm
