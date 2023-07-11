SUMMARY = "WAD composer for Doom and related games"
DESCRIPTION = "DeuTex is a .wad file composer for Doom, Heretic, Hexen and Strife. \
It can be used to extract the lumps of a WAD and save them as \
individual files. Conversely, it can also build a WAD from separate \
files. When extracting a lump to a file, it does not just copy the \
raw data, it converts it to an appropriate format (such as PNG for \
graphics, WAVE for audio samples, etc.). Conversely, when it reads \
files for inclusion in PWADs, it does the necessary conversions (for \
example, from PPM to Doom picture format). In addition, DeuTex has \
functions such as merging WADs."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.2"

RPM_NAME = "deutex-5.2.2-1.10.aarch64.rpm"
RPM_HASH = "7a012f661ba16cb607778095a45ae8a5cb26803e05bfb7651046c54f0b3f8053a679095617a8dded7c85f9e7c79a5aec5c39221897b06756e4caf313f589165e"

RPROVIDES:${PN} += "deutex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
