SUMMARY = "Bean Validation API (JSR 349)"
DESCRIPTION = "This package contains Bean Validation (JSR-349) API."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "bean-validation-api-2.0.1-1.17.noarch.rpm"
RPM_HASH = "de64c8662648659b1614a40a0b19b96f953a88c66aebbdac602e9e3a03253b2d6fc1cc8c537777f0df3c921be464b98207968fb6b0e059f2b587b192f3249d67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bean-validation-api mvn(javax.validation:validation-api) mvn(javax.validation:validation-api:pom:) osgi(javax.validation.api)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
