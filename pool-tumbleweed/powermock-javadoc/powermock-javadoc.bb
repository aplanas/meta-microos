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

RPM_NAME = "powermock-javadoc-1.6.5-4.11.noarch.rpm"
RPM_HASH = "917e25ffd26cc2ef486a8dccade531a0ee1d9a85963b31cf57cb359d8fe90366d955cb7d9f8d7a35e1673042d3ff87cc8c219f36878b4b8f271c6dac11c2b5e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "powermock-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
