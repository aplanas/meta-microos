SUMMARY = "YUI CSS compression algorithm"
DESCRIPTION = "This is a Python port of the YUI CSS Compressor."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.2.0"

RPM_NAME = "python39-cssmin-0.2.0-1.6.noarch.rpm"
RPM_HASH = "98f7f72dcc57b662612fda25f5148cb756ead1b76094fef8054b1b92f8c308ffe14ec121ac070357a72b732dc20cf02173e070e32c3deda51b1358f26d687b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cssmin \
python39-cssmin \
python3dist-cssmin"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
