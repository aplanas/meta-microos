SUMMARY = "Python high-level interface and ctypes-based bindings for PulseAudio (libpulse)"
DESCRIPTION = "Python (3.x and 2.x) high-level interface and ctypes-based bindings for \
PulseAudio (libpulse), mostly focused on mixer-like controls and \
introspection-related operations (as opposed to e.g. submitting sound samples to \
play, player-like client)."
LICENSE = "MIT"

PV = "22.3.2"

RPM_NAME = "python310-pulsectl-22.3.2-1.3.noarch.rpm"
RPM_HASH = "f6d3e78c36dbbcf2ee3a9f7465d6e6beeda896e2282298f85ea77a39048c0f7b65b428b56340a91207fbef0008ee77b36596bdc7e74601704a11dfd362c9c404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pulsectl \
python310-pulsectl \
python3dist-pulsectl"

RDEPENDS:${PN} += "pulseaudio-daemon \
python-abi \
python310-setuptools"

inherit rpm
