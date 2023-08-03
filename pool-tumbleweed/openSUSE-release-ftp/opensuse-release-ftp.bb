SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230801"

RPM_NAME = "openSUSE-release-ftp-20230801-1756.1.aarch64.rpm"
RPM_HASH = "a53740a9758b77ce376ad6906c088966660fa1eb9fe5ee10fdd95b4636e115b1706c31003cc385f36f1af2f186f966b0991e53d5edf0cc3a3d43e06c6dac02eb"

RPROVIDES:${PN} += "flavor-ftp \
openSUSE-release-ftp \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
