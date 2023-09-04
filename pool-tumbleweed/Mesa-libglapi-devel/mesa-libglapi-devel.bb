SUMMARY = "Development files for the Mesa GL API implementation"
DESCRIPTION = "Development files for the Mesa GL API module which is responsible for \
dispatching all the gl* functions. It is intended to be mainly used by \
the Mesa-libGLES* packages."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "Mesa-libglapi-devel-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "25961fb250fde6d64839d14505393f90ccc90adc67414c86b91b4021399054d973a2cb1f2303a3ab2d401c82a9c9a73487ddaea7a04edb7c8e01269f03c53e63"

RPROVIDES:${PN} += "Mesa-libglapi-devel"

RDEPENDS:${PN} += "Mesa-libglapi0"

inherit rpm
