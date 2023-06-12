SUMMARY = "Javadoc for glassfish-servlet-api"
DESCRIPTION = "API documentation for glassfish-servlet-api."
LICENSE = "(CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0) & Apache-2.0"

PV = "3.1.0"

RPM_NAME = "glassfish-servlet-api-javadoc-3.1.0-2.19.noarch.rpm"
RPM_HASH = "74f58f66f0b775fa91c5b5d0ced35c1677f2dc28b995e48eb70b2f30564317168a49287952dcb8137a849be14cca81113039e3c8afb5eac3bb54ab20f22c9116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-servlet-api-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
