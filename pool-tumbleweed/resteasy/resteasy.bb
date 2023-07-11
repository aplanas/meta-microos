SUMMARY = "Framework for RESTful Web services and Java applications"
DESCRIPTION = " \
 \
 \
 \
RESTEasy contains a JBoss project that provides frameworks to help \
build RESTful Web Services and RESTful Java applications. It is a fully \
certified and portable implementation of the JAX-RS specification."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-3.0.26-3.11.noarch.rpm"
RPM_HASH = "a39b0f6df363f67135050a2de4adafe3f49730b39bd4e52ed5baa1d4de393f4ede69014112e06d0ce61786cd2da30d82e79561c14fcc1c5c30841e3c65ba47eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "resteasy"

RDEPENDS:${PN} += "resteasy-atom-provider \
resteasy-client \
resteasy-core \
resteasy-jackson2-provider \
resteasy-jaxb-provider"

inherit rpm
