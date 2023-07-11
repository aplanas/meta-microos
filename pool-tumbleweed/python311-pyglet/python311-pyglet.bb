SUMMARY = "Windowing and multimedia library"
DESCRIPTION = "Pyglet provides an object-oriented programming interface for \
developing games and other visually-rich applications."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.0.5"

RPM_NAME = "python311-pyglet-2.0.5-1.2.noarch.rpm"
RPM_HASH = "2bce2f08816b9cc63c1120dc8625362140d68724f6452316b021702fb33fcf32197373bb2ce9dae214efd1a23fa937633a26d8a6618ce3bccf9379ffa9b1dac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyglet \
python3.11dist-pyglet \
python311-pyglet \
python3dist-pyglet"

RDEPENDS:${PN} += "Mesa-dri \
libxcb-glx0 \
python-abi \
python311-Pillow \
python311-future \
python311-pypng"

inherit rpm
