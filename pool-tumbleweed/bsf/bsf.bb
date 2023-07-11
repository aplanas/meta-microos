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

RPM_NAME = "bsf-2.4.0-17.13.noarch.rpm"
RPM_HASH = "679109822a70a500afdc494a6cad606a3d68aa4ab65b408bdf569cb5b718709d9d0723e4b9aaf30dbb154ca7bb8905be00a46facba612b00f9c7ffd7ec4d770a"
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
