SUMMARY = "OpenAL Soft auxiliary data and config"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of the OpenGL API. \
This package contains auxiliary data and config files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "openal-soft-data-1.22.2-1.4.noarch.rpm"
RPM_HASH = "d4b0d5a8d2e3c28c4f40279e264962a5d839a2179789b130221f834cd5a7014288432a0ef08f57001686d0cecf2061f4a494f3f1efd3595102df072cec8eb76b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-openal-soft-data \
openal-soft \
openal-soft-data"

RDEPENDS:${PN} += ""

inherit rpm
