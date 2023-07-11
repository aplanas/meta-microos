SUMMARY = "A 2-D game engine for Python"
DESCRIPTION = "The SGE Game Engine is a general-purpose 2-D game engine. It takes \
care of several details, such as window size management, collision \
detection, parallax scrolling, image transformation. \
 \
This implementation of the SGE uses Pygame as a backend."
LICENSE = "LGPL-3.0-or-later"

PV = "1.7.1"

RPM_NAME = "python39-sge-pygame-1.7.1-1.8.noarch.rpm"
RPM_HASH = "a62b61424b8870ec19073e70fb01e84e6dd0a10d63b2aa002e6cf6c20b018ed8cb4ddb92d86a9a0daad015bcc9c38730186c7556d4ce1866313fa562aec5570a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sge \
python39-sge-pygame \
python3dist-sge"

RDEPENDS:${PN} += "python-abi \
python39-pygame \
python39-six \
python39-uniseg"

inherit rpm
