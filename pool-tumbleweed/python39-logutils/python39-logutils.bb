SUMMARY = "Logging utilities"
DESCRIPTION = "The logutils package provides a set of handlers for the Python standard \
library's logging package. \
 \
Some of these handlers are out-of-scope for the standard library, and \
so they are packaged here. Others are updated versions which have \
appeared in recent Python releases, but are usable with older versions \
of Python and so are packaged here."
LICENSE = "BSD-3-Clause"

PV = "0.3.5"

RPM_NAME = "python39-logutils-0.3.5-5.2.noarch.rpm"
RPM_HASH = "f7f8e04d8b981573b8781e5f76ab457fca391ed240c1f8e3006feaa3f8996399b3ad099c0be0b44d607b319075c6ed2668005be1d6864fe070b99a8f00bc6da1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-logutils \
python39-logutils \
python3dist-logutils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
