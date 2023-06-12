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

RPM_NAME = "powermock-common-1.6.5-4.10.noarch.rpm"
RPM_HASH = "c09463cfbbd5538631b8e56e11ff5fac416dd860ed9c67e3590ec2b38c6f3769be2e631631a1a675bc7e33f9cf7695e8a19bfc6002c6ced7e539589c88f50ece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "powermock-common"
RDEPENDS:${PN} += ""

inherit rpm
