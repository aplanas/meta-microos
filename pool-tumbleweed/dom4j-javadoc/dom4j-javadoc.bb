SUMMARY = "Javadoc for dom4j"
DESCRIPTION = "Javadoc for dom4j."
LICENSE = "BSD-3-Clause"

PV = "2.1.4"

RPM_NAME = "dom4j-javadoc-2.1.4-1.1.noarch.rpm"
RPM_HASH = "14797e5bbc2f94cd3f82e387776a85f4ec22e56fe0d85f631ad32d2ecfdb23be94c484aa5a611140a61b353707e1ee4d46cc3cc9553972a4ac05acab77f62d34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
