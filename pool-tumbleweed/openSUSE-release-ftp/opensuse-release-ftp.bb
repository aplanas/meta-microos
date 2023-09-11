SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230904"

RPM_NAME = "openSUSE-release-ftp-20230904-1803.1.aarch64.rpm"
RPM_HASH = "1827d0b6dd20e1ad4b87706aa07269efcc45c98759d791ad6c65fbf9c0e859a35a95d3df9ee94098f5cca942ba0949fcd0a869e583163a5935f38bee908df4bf"

RPROVIDES:${PN} += "flavor-ftp \
openSUSE-release-ftp \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
