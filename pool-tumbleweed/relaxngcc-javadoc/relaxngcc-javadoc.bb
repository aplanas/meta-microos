SUMMARY = "Javadoc for relaxngcc"
DESCRIPTION = "This package contains javadoc for relaxngcc."
LICENSE = "Apache-1.1"

PV = "1.12"

RPM_NAME = "relaxngcc-javadoc-1.12-3.4.noarch.rpm"
RPM_HASH = "558302a249e17c0f85ba1ca5be3410c17419edd95242ca26281594827a7842ced005e37a0826bc818ed422d67eac5051f16e154d6895fe74e72838cb32b4aad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "relaxngcc-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
