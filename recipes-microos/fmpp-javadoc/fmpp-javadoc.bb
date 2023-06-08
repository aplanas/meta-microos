SUMMARY = "Javadoc for fmpp"
DESCRIPTION = "Javadoc for fmpp."
LICENSE = "Apache-2.0"

PV = "0.9.16"

RPM_NAME = "fmpp-javadoc-0.9.16-2.10.noarch.rpm"
RPM_HASH = "004c2499a7cd2cf7a5f97b019747f50fb996a9d4eba3e2f7d2c1247e46346f57c5ff6e26fe96075d24c9132af68e87e5e21d3352e5a8449ded006ea520d19c2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fmpp-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
