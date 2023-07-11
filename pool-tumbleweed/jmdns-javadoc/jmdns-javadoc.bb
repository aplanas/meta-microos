SUMMARY = "API documentation for jmdns"
DESCRIPTION = "API documentation for jmdns."
LICENSE = "Apache-2.0"

PV = "3.5.7"

RPM_NAME = "jmdns-javadoc-3.5.7-2.11.noarch.rpm"
RPM_HASH = "a3684eb9be5d8c7bc98c6a1759eb7e7ecdeab778d2c5db55cf2d965ada8fd7de150f60b8f14edd1311aa35ae55ff49e069f7ae9e234a9d5605f80682d4f63caf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmdns-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
