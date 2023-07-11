SUMMARY = "xSGE Lighting Library"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides an interface for lighting."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python39-xsge_lighting-1.0.2-1.8.noarch.rpm"
RPM_HASH = "ba28918c103fb0d1e82a5623d58262ad87c43fb01ebff1751c074189397c141be84384e9c0453a1e9845c7be59f1103989b8c387609d7350a8e6318fa14b9657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xsge-lighting \
python39-xsge-lighting \
python3dist-xsge-lighting"

RDEPENDS:${PN} += "python-abi \
python39-sge-pygame \
python39-six"

inherit rpm
