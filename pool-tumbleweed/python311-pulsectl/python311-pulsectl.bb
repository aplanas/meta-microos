SUMMARY = "Python high-level interface and ctypes-based bindings for PulseAudio (libpulse)"
DESCRIPTION = "Python (3.x and 2.x) high-level interface and ctypes-based bindings for \
PulseAudio (libpulse), mostly focused on mixer-like controls and \
introspection-related operations (as opposed to e.g. submitting sound samples to \
play, player-like client)."
LICENSE = "MIT"

PV = "22.3.2"

RPM_NAME = "python311-pulsectl-22.3.2-1.2.noarch.rpm"
RPM_HASH = "4632cc67491f81753079050380ca0347b632e45262fd0dc1ede0bceb34ef538211967c69b5c8facee3db73fa99f5623fb05ba0b83f31abc9d4fadb0504957ed7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pulsectl \
python311-pulsectl \
python3dist-pulsectl"

RDEPENDS:${PN} += "pulseaudio-daemon \
python-abi \
python311-setuptools"

inherit rpm
