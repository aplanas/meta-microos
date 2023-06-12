SUMMARY = "XML-Java binding tool"
DESCRIPTION = "XMLBeans is an XML-Java binding tool that allows accessing XML in a \
Java-typical way. The features of XML and XML Schema are mapped to \
the equivalent Java language and typing constructs. XMLBeans uses XML \
Schema to compile Java interfaces and classes that can then be used \
to access and modify XML instance data. XMLBeans is similar to other \
Java interface/class, with a number of getFoo or setFoo methods. \
There are also APIs that allow you access to the full XML infoset as \
well so as to allow you to reflect into the XML schema itself through \
an XML Schema Object model."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "xmlbeans-2.6.0-13.1.noarch.rpm"
RPM_HASH = "7dbdb458a128abb858979ca7f76a17ca84f79c1288ae7cc7509a715d8efffe5932b6ecfac942a21871fa513b86e590df591ab8b25efb1c996dc44566bb32695a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmlbeans"
RDEPENDS:${PN} += ""

inherit rpm
