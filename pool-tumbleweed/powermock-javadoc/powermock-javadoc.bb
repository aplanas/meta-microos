SUMMARY = "JavaDocs for powermock"
DESCRIPTION = " \
PowerMock is a framework that extend other mock libraries \
such as EasyMock with more powerful capabilities. PowerMock uses a \
custom classloader and bytecode manipulation to enable mocking of \
static methods, constructors, final classes and methods, private \
methods, removal of static initializers and more. \
 \
This package contains the API documentation for powermock."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "powermock-javadoc-1.6.5-5.1.noarch.rpm"
RPM_HASH = "775464a9a8058d0ee2f789c10efe21e01795053d847d7b43417e66867a88ddd21e5eeda5ec14272f8f560f5cb3b162fbe53350de52e0f6cf79b5ee9e48cc9ff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "powermock-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
