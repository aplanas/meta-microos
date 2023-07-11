SUMMARY = "Windowing and multimedia library"
DESCRIPTION = "Pyglet provides an object-oriented programming interface for \
developing games and other visually-rich applications."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.0.5"

RPM_NAME = "python39-pyglet-2.0.5-1.2.noarch.rpm"
RPM_HASH = "06a57b68c64c7821a30d76fd0b06b0dc8681647086e533376e1b832c4ceee70ad587507eb14731dc97a04dbe1b0cf300e48ae39b0a647830e03ff58244eb3ed4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyglet \
python39-pyglet \
python3dist-pyglet"

RDEPENDS:${PN} += "Mesa-dri \
libxcb-glx0 \
python-abi \
python39-Pillow \
python39-future \
python39-pypng"

inherit rpm
