SUMMARY = "Javadoc for bsf"
DESCRIPTION = "Bean Scripting Framework (BSF) is a set of Java classes which provides \
scripting language support within Java applications, and access to Java \
objects and methods from scripting languages. BSF allows one to write \
JSPs in languages other than Java while providing access to the Java \
class library. In addition, BSF permits any Java application to be \
implemented in part (or dynamically extended) by a language that is \
embedded within it. This is achieved by providing an API that permits \
calling scripting language engines from within Java, as well as an \
object registry that exposes Java objects to these scripting language \
engines. \
 \
This package contains the javadoc documentation for the Bean Scripting \
Framework."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "bsf-javadoc-2.4.0-17.12.noarch.rpm"
RPM_HASH = "1f369ef0895ecd7095ea67a37457ee89f22c17189bf7993186cb65c333f2b2e7daf89303c474adc6f295aeec96d980579755076f5a7ec3eaadc0a72e9bdeec2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bsf-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
