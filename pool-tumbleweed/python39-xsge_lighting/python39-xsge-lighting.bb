SUMMARY = "xSGE Lighting Library"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides an interface for lighting."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python39-xsge_lighting-1.0.2-1.7.noarch.rpm"
RPM_HASH = "5cd3513cc81b508738f73eda30b206992b50cb97fd6f5e374b0812b5f22f8005ab997b158769c4767f0d1b459c95ee1eb175965b7a4f603456142ed71a655187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xsge-lighting \
python39-xsge-lighting \
python3dist-xsge-lighting"

RDEPENDS:${PN} += "python-abi \
python39-sge-pygame \
python39-six"

inherit rpm
