SUMMARY = "Development files for the Mesa GL API implementation"
DESCRIPTION = "Development files for the Mesa GL API module which is responsible for \
dispatching all the gl* functions. It is intended to be mainly used by \
the Mesa-libGLES* packages."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "Mesa-libglapi-devel-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "42804d64d4507e474aecbd651f392b31ee47f1b62254b0aae11aca9c6ea0d087f403e0fe385f2b3df8b2be033673cfdd68b72e2415cc2de7582be017b829b14f"

RPROVIDES:${PN} += "Mesa-libglapi-devel"

RDEPENDS:${PN} += "Mesa-libglapi0"

inherit rpm
