SUMMARY = "Javadoc for glassfish-servlet-api"
DESCRIPTION = "API documentation for glassfish-servlet-api."
LICENSE = "(CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0) & Apache-2.0"

PV = "3.1.0"

RPM_NAME = "glassfish-servlet-api-javadoc-3.1.0-2.20.noarch.rpm"
RPM_HASH = "d69e8aa67724387483c3ffd23ce88e10bfd46fa1c169d1d96dc125d65ff0bb7a49d0837b86ad649060af3f64faf24f69b649082130bc1005f4caf2e8edd02943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-servlet-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
