SUMMARY = "Javadoc for wsdl4j"
DESCRIPTION = "The Web Services Description Language for Java Toolkit (WSDL4J) allows \
the creation, representation, and manipulation of WSDL documents \
describing services.  This codebase will eventually serve as a \
reference implementation of the standard created by JSR110. \
 \
This package contains the javadoc documentation for the Web Services \
Description Language for Java."
LICENSE = "IPL-1.0"

PV = "1.6.3"

RPM_NAME = "wsdl4j-javadoc-1.6.3-11.7.noarch.rpm"
RPM_HASH = "c55fe1cf9de35e5c205b8b29a41f27170e5d484649f9314e1595b65b957cd4f3a2455352c37a5545b777e75124c70689df9d9f987f58bd3366c0365931e6748b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wsdl4j-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
