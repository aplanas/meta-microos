SUMMARY = "Fluid (R3) General MIDI SoundFont (GS)"
DESCRIPTION = "This is a GS SoundFont, for use with any modern MIDI synthesiser: hardware \
(like the emu10k1 sound card), or software (like FluidSynth). \
 \
This package provides the smaller GS sound set of Roland Sound Canvas \
extensions."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "fluid-soundfont-gs-3.1-5.16.noarch.rpm"
RPM_HASH = "d8f2f2b596316e4cd4935b6c63c902e44b51ed8567a83122ec2aaadeb853102d4a89ec31491db923eb8cc505ff2b42737418d99e3fcc2de5004c3d27b6b2ba8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(fluid-soundfont-gs) fluid-soundfont-gs"
RDEPENDS:${PN} += "fluid-soundfont-gm"

inherit rpm
