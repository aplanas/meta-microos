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

RPM_NAME = "aopalliance-1.0-3.1.noarch.rpm"
RPM_HASH = "4fe99a28c36471ce4a5c76843d2cc976475e7694f97234600de61dd2462daebe807d8ebef67ec11f2b27f22263a650938acd86b065c3c2ced67c1ff209b6e6cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aopalliance \
mvn(aopalliance:aopalliance) \
osgi(aopalliance)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
