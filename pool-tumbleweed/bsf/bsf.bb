SUMMARY = "Bean Scripting Framework"
DESCRIPTION = "Bean Scripting Framework (BSF) is a set of Java classes that provides \
scripting language support within Java applications and access to Java \
objects and methods from scripting languages. BSF allows writing JSPs \
in languages other than Java while providing access to the Java class \
library. In addition, BSF permits any Java application to be \
implemented in part (or dynamically extended) by a language that is \
embedded within it. This is achieved by providing an API that permits \
calling scripting language engines from within Java as well as an \
object registry that exposes Java objects to these scripting language \
engines. \
 \
This BSF package currently supports several scripting languages: * \
   Javascript (using Rhino ECMAScript, from the Mozilla project) \
* XSLT Stylesheets (as a component of Apache XML project's Xalan and \
   Xerces) \
 \
In addition, the following languages are supported with their own \
   BSF engines: * Java (using BeanShell, from the BeanShell project) \
* JRuby \
* JudoScript"
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "bsf-2.4.0-17.12.noarch.rpm"
RPM_HASH = "0c06883ad963bbd792c78af4ec3e5d7289250667bf783d27e203440fb74a849c500d26750646e529c83b1268f90a48020f3545bd2655ce8464170c64f72ff9f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bsf \
mvn-bsf-bsf \
mvn-bsf-bsf-pom- \
mvn-org.apache.bsf-bsf \
mvn-org.apache.bsf-bsf-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging"

inherit rpm
