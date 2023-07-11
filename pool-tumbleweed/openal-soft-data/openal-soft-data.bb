SUMMARY = "OpenAL Soft auxiliary data and config"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of the OpenGL API. \
This package contains auxiliary data and config files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "openal-soft-data-1.22.2-1.5.noarch.rpm"
RPM_HASH = "811170d09f62f8441892871512b734cbf4d007f298af22b594526bd3b8a609ebb5159aebbe8ba7698fbd04edfcd275153b30e29391fd5a4f33e634d00e90c7ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-openal-soft-data \
openal-soft \
openal-soft-data"

RDEPENDS:${PN} += ""

inherit rpm
