SUMMARY = "Python high-level interface and ctypes-based bindings for PulseAudio (libpulse)"
DESCRIPTION = "Python (3.x and 2.x) high-level interface and ctypes-based bindings for \
PulseAudio (libpulse), mostly focused on mixer-like controls and \
introspection-related operations (as opposed to e.g. submitting sound samples to \
play, player-like client)."
LICENSE = "MIT"

PV = "22.3.2"

RPM_NAME = "python39-pulsectl-22.3.2-1.2.noarch.rpm"
RPM_HASH = "899f1a8d5c1df574450dc8181f10fee0091515fb70498953319699c7777fa12b9a6761b25d154820a10688a4f2fe53b878592acf2f6f0a169701aa3fadb71719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pulsectl) \
python39-pulsectl \
python3dist(pulsectl)"
RDEPENDS:${PN} += "pulseaudio-daemon \
python(abi) \
python39-setuptools"

inherit rpm
