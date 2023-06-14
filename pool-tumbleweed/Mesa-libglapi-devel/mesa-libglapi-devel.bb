SUMMARY = "Development files for the Mesa GL API implementation"
DESCRIPTION = "Development files for the Mesa GL API module which is responsible for \
dispatching all the gl* functions. It is intended to be mainly used by \
the Mesa-libGLES* packages."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-libglapi-devel-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "578a42fcce92d48022d15de479321c53aa675a73e4e5557f4e36c6278fc5c2505ea3a7d0de2cc052b4f658e9c34dea937ed8f62985aa831e20932c7951c99e94"

RPROVIDES:${PN} += "Mesa-libglapi-devel"

RDEPENDS:${PN} += "Mesa-libglapi0"

inherit rpm
