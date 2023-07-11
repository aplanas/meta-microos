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

RPM_NAME = "bsf-javadoc-2.4.0-17.13.noarch.rpm"
RPM_HASH = "005aa5ebb927f25fcd1a0b330c064b84e2cbaf73d3d60f8ceb741f4cdcb18b3a960b2799ee2fe853aca5334a0d03fe79a49a9eb8ed20e454acae606eb460d77a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bsf-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
