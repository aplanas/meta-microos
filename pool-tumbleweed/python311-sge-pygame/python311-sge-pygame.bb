SUMMARY = "A 2-D game engine for Python"
DESCRIPTION = "The SGE Game Engine is a general-purpose 2-D game engine. It takes \
care of several details, such as window size management, collision \
detection, parallax scrolling, image transformation. \
 \
This implementation of the SGE uses Pygame as a backend."
LICENSE = "LGPL-3.0-or-later"

PV = "1.7.1"

RPM_NAME = "python311-sge-pygame-1.7.1-1.8.noarch.rpm"
RPM_HASH = "1d753115f422ca182c1a491f80cc8bf92b0739ad98dabdb53d2d303e168020688e8792a39fda719f1707618f973e0740da25305fa4070e1b16fa43e568128508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sge-pygame \
python3.11dist-sge \
python311-sge-pygame \
python3dist-sge"

RDEPENDS:${PN} += "python-abi \
python311-pygame \
python311-six \
python311-uniseg"

inherit rpm
