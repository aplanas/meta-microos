SUMMARY = "Python high-level interface and ctypes-based bindings for PulseAudio (libpulse)"
DESCRIPTION = "Python (3.x and 2.x) high-level interface and ctypes-based bindings for \
PulseAudio (libpulse), mostly focused on mixer-like controls and \
introspection-related operations (as opposed to e.g. submitting sound samples to \
play, player-like client)."
LICENSE = "MIT"

PV = "22.3.2"

RPM_NAME = "python310-pulsectl-22.3.2-1.2.noarch.rpm"
RPM_HASH = "8dae99e49e1e7154d3ae9b067e3764b6152b8d4041c24cd04493843c3dba5845110063b479f701563b10bdf9b1516e0cab39226bfb486cc99c1eb507815381e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pulsectl \
python3.10dist-pulsectl \
python310-pulsectl \
python3dist-pulsectl"

RDEPENDS:${PN} += "pulseaudio-daemon \
python-abi \
python310-setuptools"

inherit rpm
