SUMMARY = "Development files for the Mesa GL API implementation"
DESCRIPTION = "Development files for the Mesa GL API module which is responsible for \
dispatching all the gl* functions. It is intended to be mainly used by \
the Mesa-libGLES* packages."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "Mesa-libglapi-devel-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "5877c2562ac73eaefb1601bce18347ff0ca17a20aaf5c602548d382fab1fe4626df212c440901c1f6ced8699887cf761b92da5cefe27c77206b475bde74740cc"

RPROVIDES:${PN} += "Mesa-libglapi-devel"

RDEPENDS:${PN} += "Mesa-libglapi0"

inherit rpm
