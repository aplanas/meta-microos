SUMMARY = "Fluid (R3) General MIDI SoundFont (GM)"
DESCRIPTION = "This is a GM SoundFont, for use with any modern MIDI synthesiser: hardware \
(like the emu10k1 sound card), or software (like FluidSynth). \
 \
This package provides the larger GM sound set, without the Roland Sound \
Canvas extensions."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "fluid-soundfont-gm-3.1-5.16.noarch.rpm"
RPM_HASH = "2dd0ccaec2bf6c2cb2981307f76c54f71af9795618151c9d3e602f508b8e8bcbbba6c0e488692f9e59e470030bbaca4f9d465363d74c749c7aad51622826f5f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(fluid-soundfont-gm) fluid-soundfont-gm"
RDEPENDS:${PN} += ""

inherit rpm
