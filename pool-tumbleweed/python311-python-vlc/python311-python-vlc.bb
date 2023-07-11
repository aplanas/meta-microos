SUMMARY = "VLC bindings for python"
DESCRIPTION = "VLC bindings for python. \
 \
This module provides ctypes-based bindings for the native libvlc API \
(see http://wiki.videolan.org/LibVLC) of the VLC video player."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0.18122"

RPM_NAME = "python311-python-vlc-3.0.18122-1.2.noarch.rpm"
RPM_HASH = "017cbfd70b64f2b10e64d5cf23564a2aab47bf6b9d126caecfa87237566f40676ef8527db73e19a16d9500938a94eb96040842f4e5d763690e407cab8fa983ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-vlc \
python3.11dist-python-vlc \
python311-python-vlc \
python3dist-python-vlc"

RDEPENDS:${PN} += "libvlc5 \
python-abi"

inherit rpm
