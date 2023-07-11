SUMMARY = "API documentation for jflex"
DESCRIPTION = "This package provides API documentation for jflex."
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "jflex-javadoc-1.8.2-5.2.noarch.rpm"
RPM_HASH = "d38ed17c2ecf0dde18b0846328f2e271040aba3dc787b6e5bd11a2fdbb54ff3f541dfb15ab51f68cfe371d1d7a6f20f0d903a9947bf90c120f54187cc64c14ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jflex-doc \
jflex-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
