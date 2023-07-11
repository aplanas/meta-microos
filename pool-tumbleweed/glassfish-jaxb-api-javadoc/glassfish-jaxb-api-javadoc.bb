SUMMARY = "Javadoc for jaxb-spec"
DESCRIPTION = "Glassfish - JAXB (JSR 222) API. \
 \
This package contains javadoc for glassfish-jaxb-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.4.0"

RPM_NAME = "glassfish-jaxb-api-javadoc-2.4.0-5.6.noarch.rpm"
RPM_HASH = "845f882472b5398778adcc934b8f893ebf9f084a9224415dd930589e7c0af7dd007f706d0371637dec1b80849b3e9869ee58fa4ac0ba322d4182f443a93844f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
