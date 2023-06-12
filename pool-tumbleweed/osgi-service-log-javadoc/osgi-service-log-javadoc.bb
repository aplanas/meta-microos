SUMMARY = "API documentation for osgi-service-log"
DESCRIPTION = "This package provides API documentation for osgi-service-log."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "osgi-service-log-javadoc-1.5.0-1.3.noarch.rpm"
RPM_HASH = "0fc822f09dcdc6152a80ac287987e022c165501ea1669de587899896ea81b5e92a342717b0e7ae836d7458d262d5a4a72f2857d370ac22098a9518c26eafd577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-service-log-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
