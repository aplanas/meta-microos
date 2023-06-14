SUMMARY = "A 2-D game engine for Python"
DESCRIPTION = "The SGE Game Engine is a general-purpose 2-D game engine. It takes \
care of several details, such as window size management, collision \
detection, parallax scrolling, image transformation. \
 \
This implementation of the SGE uses Pygame as a backend."
LICENSE = "LGPL-3.0-or-later"

PV = "1.7.1"

RPM_NAME = "python310-sge-pygame-1.7.1-1.7.noarch.rpm"
RPM_HASH = "f4a3a9387460b72ef9a247091f56ba4cfb7354da72e89670792c74419f471c0ff5a3f536aa5ee2b4dcc107dd9354d3348485aa63177e9e3086c0ab51ed5ad7c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sge-pygame \
python3.10dist-sge \
python310-sge-pygame \
python3dist-sge"

RDEPENDS:${PN} += "python-abi \
python310-pygame \
python310-six \
python310-uniseg"

inherit rpm
