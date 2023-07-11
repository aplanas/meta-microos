SUMMARY = "Python high-level interface and ctypes-based bindings for PulseAudio (libpulse)"
DESCRIPTION = "Python (3.x and 2.x) high-level interface and ctypes-based bindings for \
PulseAudio (libpulse), mostly focused on mixer-like controls and \
introspection-related operations (as opposed to e.g. submitting sound samples to \
play, player-like client)."
LICENSE = "MIT"

PV = "22.3.2"

RPM_NAME = "python311-pulsectl-22.3.2-1.3.noarch.rpm"
RPM_HASH = "9458032a28196c31fae3b8a1f299856e704ff605eac56c6e5a0598e1eb43a079146b2c6ba24317a6bcdca96bf9eeca4bc3b3d0fae4ae9807e5aed952ad62265f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pulsectl \
python3.11dist-pulsectl \
python311-pulsectl \
python3dist-pulsectl"

RDEPENDS:${PN} += "pulseaudio-daemon \
python-abi \
python311-setuptools"

inherit rpm
