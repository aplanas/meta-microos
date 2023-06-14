SUMMARY = "Scripting for Java (BeanShell Version 2.x)"
DESCRIPTION = "BeanShell is an embeddable Java source interpreter with object \
scripting language features, written in Java. BeanShell executes \
standard Java statements and expressions, in addition to obvious \
scripting commands and syntax. BeanShell supports scripted objects as \
simple method closures like those in Perl and JavaScript. BeanShell \
can be used interactively for Java experimentation and debugging or \
as a scripting engine for applications."
LICENSE = "LGPL-2.0-or-later | SPL-1.0"

PV = "2.1.1"

RPM_NAME = "bsh2-2.1.1-1.1.noarch.rpm"
RPM_HASH = "4f5ab6b964fe21d21070116219330305e1b1e77cb00a79d83678e2b860adb2627ffebf0a1a7cf9986e81b3c755a0f1de45643403e5ee9e95b93d1b18d9a2fc21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bsh2 \
mvn-bsh-bsh \
mvn-bsh-bsh-bsf \
mvn-bsh-bsh-bsf-pom- \
mvn-bsh-bsh-pom- \
mvn-org.apache-extras.beanshell-bsh \
mvn-org.apache-extras.beanshell-bsh-pom- \
mvn-org.beanshell-bsh \
mvn-org.beanshell-bsh-pom- \
mvn-org.beanshell-bsh2 \
mvn-org.beanshell-bsh2-pom-"

RDEPENDS:${PN} += "bsf \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
