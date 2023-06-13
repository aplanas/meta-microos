SUMMARY = "Javadoc for sblim-cim-client2"
DESCRIPTION = "Javadoc for sblim-cim-client2."
LICENSE = "EPL-1.0"

PV = "2.2.5"

RPM_NAME = "sblim-cim-client2-javadoc-2.2.5-7.3.noarch.rpm"
RPM_HASH = "8caeb962c43c7506116e7193f13a91b7c99941d014282910a5f7bb7813c6698bf9a5cb8bc638f499ec2e1d5bb269696c6aad40e45098dca40af20cfca77a8a8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sblim-cim-client2-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
