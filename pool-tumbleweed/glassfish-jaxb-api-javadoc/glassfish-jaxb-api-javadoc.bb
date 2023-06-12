SUMMARY = "Javadoc for jaxb-spec"
DESCRIPTION = "Glassfish - JAXB (JSR 222) API. \
 \
This package contains javadoc for glassfish-jaxb-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.4.0"

RPM_NAME = "glassfish-jaxb-api-javadoc-2.4.0-5.5.noarch.rpm"
RPM_HASH = "2e6c292fb495cb19f108317c6aae465e1843976264798998dc7d58387af109424c389967a20c217694a388be32550a9d34868035a4f3c0223e8d60ef07548448"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-api-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
