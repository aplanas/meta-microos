SUMMARY = "VLC bindings for python"
DESCRIPTION = "VLC bindings for python. \
 \
This module provides ctypes-based bindings for the native libvlc API \
(see http://wiki.videolan.org/LibVLC) of the VLC video player."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0.18122"

RPM_NAME = "python310-python-vlc-3.0.18122-1.2.noarch.rpm"
RPM_HASH = "44516239788b3f3e746ab036a045486fbee7e8f3261dd512921255dc00b774a595f3e7f7370a6af8d6b8d118b6e4415b40f69d5ff617dd6953f1cf7b2f4fca75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-vlc \
python310-python-vlc \
python3dist-python-vlc"

RDEPENDS:${PN} += "libvlc5 \
python-abi"

inherit rpm
