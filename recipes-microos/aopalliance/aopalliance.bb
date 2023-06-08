SUMMARY = "Java/J2EE AOP standards"
DESCRIPTION = "Aspect-Oriented Programming (AOP) offers a better solution to many \
problems than do existing technologies, such as EJB.  AOP Alliance \
facilitates and standardizes the use of AOP. \
 \
This package contains APIs for program instrumentation, interception \
mechanisms, and a set of interfaces for implementing a generic \
reflection API."
LICENSE = "SUSE-Public-Domain"

PV = "1.0"

RPM_NAME = "aopalliance-1.0-2.5.noarch.rpm"
RPM_HASH = "d1c26620c97b5d8abb7a6a54c6e2d1c69fa527b23e6a2c22e6591b9f7a3934fb9588b6953b4edb08f9a41fa91e56586ed01ae562c6009c48507296f3ff18c1ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aopalliance mvn(aopalliance:aopalliance) mvn(aopalliance:aopalliance:pom:) osgi(aopalliance)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
