SUMMARY = "Javadoc for felix-gogo-command"
DESCRIPTION = "This package contains API documentation for felix-gogo-command."
LICENSE = "Apache-2.0"

PV = "1.1.2"

RPM_NAME = "felix-gogo-command-javadoc-1.1.2-1.4.noarch.rpm"
RPM_HASH = "86d0a315a91b20725a94e4b17ff735a76e79d4066bb2d245547e5061ebb27ec4de94f348de3a1ba91aaddcfa6f9b522799b5731b24f70db21217748c7ffbce9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-command-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
