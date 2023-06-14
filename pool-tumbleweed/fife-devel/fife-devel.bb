SUMMARY = "Development files for the FIFE 2D game engine"
DESCRIPTION = "FIFE stands for Flexible Isometric Free Engine and is a cross platform \
game creation framework. It provides the ability to create a \
game using Python interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.2"

RPM_NAME = "fife-devel-0.4.2-5.16.aarch64.rpm"
RPM_HASH = "a204864c0483ce39cb16e80d824291f317e9428d6e1b54b4104cc9b35b289e126f5882e23ba2fdae195609f24ebf1d1aa64d0586395d4bf9a2e81554cfe9473e"

RPROVIDES:${PN} += "fife-devel"

RDEPENDS:${PN} += "libfife0-4-2 \
python3-fife"

inherit rpm
