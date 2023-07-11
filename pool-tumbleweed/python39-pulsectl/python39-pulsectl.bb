SUMMARY = "Python high-level interface and ctypes-based bindings for PulseAudio (libpulse)"
DESCRIPTION = "Python (3.x and 2.x) high-level interface and ctypes-based bindings for \
PulseAudio (libpulse), mostly focused on mixer-like controls and \
introspection-related operations (as opposed to e.g. submitting sound samples to \
play, player-like client)."
LICENSE = "MIT"

PV = "22.3.2"

RPM_NAME = "python39-pulsectl-22.3.2-1.3.noarch.rpm"
RPM_HASH = "18531500297e0d763eeb6cea6b6164a03ca4487d63bb14075b9749ddba7f26b1f77441b065a9c3b67abcd35347d60f2a73fc1b26dd2e1999a81fdd41e6e371eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pulsectl \
python39-pulsectl \
python3dist-pulsectl"

RDEPENDS:${PN} += "pulseaudio-daemon \
python-abi \
python39-setuptools"

inherit rpm
