SUMMARY = "Common files for PowerMock"
DESCRIPTION = " \
PowerMock is a framework that extend other mock libraries \
such as EasyMock with more powerful capabilities. PowerMock uses a \
custom classloader and bytecode manipulation to enable mocking of \
static methods, constructors, final classes and methods, private \
methods, removal of static initializers and more. \
 \
This package contains common files for all PowerMock modules."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "powermock-common-1.6.5-4.11.noarch.rpm"
RPM_HASH = "b542e2d800c77e9fecedee80e34ae86db8d36ec22bc9aac9e9cfd12e750f9a99ecb68f802bc1512ecdd2552a874a3b50c27cc0494d661e5e22fd1a513ff8f131"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "powermock-common"

RDEPENDS:${PN} += ""

inherit rpm
