SUMMARY = "Javadoc for codemodel"
DESCRIPTION = "This package contains the API documentation for codemodel."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.6"

RPM_NAME = "codemodel-javadoc-2.6-4.4.noarch.rpm"
RPM_HASH = "5af6a48cceb30b5d404991843273af85e93780cce356af4ad71a6a00a7dee4d28aa9703d73b3290519fd51e18368845970ad9f9961a478e447aade0c823318bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "codemodel-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
