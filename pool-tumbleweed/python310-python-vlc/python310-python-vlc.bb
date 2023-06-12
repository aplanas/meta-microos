SUMMARY = "VLC bindings for python"
DESCRIPTION = "VLC bindings for python. \
 \
This module provides ctypes-based bindings for the native libvlc API \
(see http://wiki.videolan.org/LibVLC) of the VLC video player."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0.18122"

RPM_NAME = "python310-python-vlc-3.0.18122-1.1.noarch.rpm"
RPM_HASH = "d7e7b810f3a38ad036452bc90abde188dbc977010154f50cc0994ad05efec4a5cff051856cb1fe1c610a0a20f96fe46bad57e0724db06e3bb7f9d681af3c02ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-vlc \
python3.10dist(python-vlc) \
python310-python-vlc \
python3dist(python-vlc)"
RDEPENDS:${PN} += "libvlc5 \
python(abi)"

inherit rpm
