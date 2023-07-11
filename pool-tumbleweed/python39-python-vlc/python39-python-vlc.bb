SUMMARY = "VLC bindings for python"
DESCRIPTION = "VLC bindings for python. \
 \
This module provides ctypes-based bindings for the native libvlc API \
(see http://wiki.videolan.org/LibVLC) of the VLC video player."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0.18122"

RPM_NAME = "python39-python-vlc-3.0.18122-1.2.noarch.rpm"
RPM_HASH = "c807e7404b044d57e0f7ecf64f9511e7e7b0e8d994d5ef0a7829eb4e77b72e51472b04b2e147ff05083b239a2d8bdde3cde0e07d2682872c0b98311a4c9e0d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-vlc \
python39-python-vlc \
python3dist-python-vlc"

RDEPENDS:${PN} += "libvlc5 \
python-abi"

inherit rpm
