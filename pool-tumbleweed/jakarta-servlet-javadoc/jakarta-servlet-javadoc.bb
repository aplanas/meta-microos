SUMMARY = "Javadoc for jakarta-servlet"
DESCRIPTION = "API documentation for jakarta-servlet."
LICENSE = "Apache-2.0 & (EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "5.0.0"

RPM_NAME = "jakarta-servlet-javadoc-5.0.0-1.8.noarch.rpm"
RPM_HASH = "0a4f2e3247cbd2c7274d91a237e8087e72c98138371083e42c006b664f5afc325305d84723888ec84f89599629583fddc260585c8fc8a534ec700e874a7fb018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-servlet-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
