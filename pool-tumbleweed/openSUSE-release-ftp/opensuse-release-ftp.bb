SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230712"

RPM_NAME = "openSUSE-release-ftp-20230712-1733.1.aarch64.rpm"
RPM_HASH = "65f6e68402d26f554f13a322d4f9e66f17a51cf03988d44bf33a54d82559cc321c77a59dc8dd3594c4c6f8e09173847321b7d90c882581113b94f038348827fc"

RPROVIDES:${PN} += "flavor-ftp \
openSUSE-release-ftp \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
