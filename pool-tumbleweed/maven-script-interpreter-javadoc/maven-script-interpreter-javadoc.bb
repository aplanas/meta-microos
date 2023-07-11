SUMMARY = "Javadoc for maven-script-interpreter"
DESCRIPTION = "API documentation for maven-script-interpreter."
LICENSE = "Apache-2.0"

PV = "1.3"

RPM_NAME = "maven-script-interpreter-javadoc-1.3-1.5.noarch.rpm"
RPM_HASH = "dd07f4b417185eff662ab90559e50761152b542e2e05b11e9ac2de2e760a9170756070ce939a5d62e7d47df1a7fa85d5f45a05558c4ea46e7160a4c3416612be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-script-interpreter-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
