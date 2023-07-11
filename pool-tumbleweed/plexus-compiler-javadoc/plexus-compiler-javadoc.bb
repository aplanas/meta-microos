SUMMARY = "Javadoc for plexus-compiler"
DESCRIPTION = "API documentation for plexus-compiler."
LICENSE = "Apache-1.1 & Apache-2.0 & MIT"

PV = "2.11.1"

RPM_NAME = "plexus-compiler-javadoc-2.11.1-3.5.noarch.rpm"
RPM_HASH = "0c53f2f8579453623552279ad9fb7a8a8817d1bdc47a2533e903c1add10b218f35902990e8c4182258f742aee338bcdca49407bde41b08445ffc51e540d121c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-compiler-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
