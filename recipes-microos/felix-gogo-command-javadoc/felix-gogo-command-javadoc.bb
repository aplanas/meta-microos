SUMMARY = "Javadoc for felix-gogo-command"
DESCRIPTION = "This package contains API documentation for felix-gogo-command."
LICENSE = "Apache-2.0"

PV = "1.1.2"

RPM_NAME = "felix-gogo-command-javadoc-1.1.2-1.3.noarch.rpm"
RPM_HASH = "ddcf680e7f397bbb52788f63343e2770d061259d4de6e7ad4a2f94e9488fae80ab6294a8e609dfa679a8b8d25847be593481f2181578cb029bba64bf7489dc2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-command-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
