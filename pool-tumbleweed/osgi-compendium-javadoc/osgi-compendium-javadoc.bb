SUMMARY = "API documentation for osgi-compendium"
DESCRIPTION = "This package provides API documentation for osgi-compendium."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "osgi-compendium-javadoc-7.0.0-3.1.noarch.rpm"
RPM_HASH = "a193175fccdfaa6dbeff4016efd01bde357ddf7f1d12f6304ce18306eaf3b777989e1647f36383922a5835aa049eb130f851f3293b05ccf0adcc15f2afd5b36a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-compendium-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
