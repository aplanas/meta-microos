SUMMARY = "A 2-D game engine for Python"
DESCRIPTION = "The SGE Game Engine is a general-purpose 2-D game engine. It takes \
care of several details, such as window size management, collision \
detection, parallax scrolling, image transformation. \
 \
This implementation of the SGE uses Pygame as a backend."
LICENSE = "LGPL-3.0-or-later"

PV = "1.7.1"

RPM_NAME = "python310-sge-pygame-1.7.1-1.8.noarch.rpm"
RPM_HASH = "77affc0bb7aa37f16bcad62f6f3f975370e721512e488478fd283dd1e30dbc13f231f2694316cfb5fa372b2d03ed1ee62f03b5e49c668910b985a726a2353301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sge \
python310-sge-pygame \
python3dist-sge"

RDEPENDS:${PN} += "python-abi \
python310-pygame \
python310-six \
python310-uniseg"

inherit rpm
