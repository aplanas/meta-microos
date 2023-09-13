SUMMARY = "Javadoc for kryo"
DESCRIPTION = "This package contains javadoc for kryo."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "kryo-javadoc-4.0.2-3.1.noarch.rpm"
RPM_HASH = "7e446ec7b8211bed932ff10b6c1c03b261eeecaa0e9c07a6c0e7de74f8c3b7ce37b4868c19ef645434f526d89b98b1ceb7ca56dd0a0b7ce047d49b4ab1e064a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kryo-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
