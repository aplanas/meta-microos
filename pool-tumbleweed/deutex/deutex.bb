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

RPM_NAME = "deutex-5.2.2-1.9.aarch64.rpm"
RPM_HASH = "a99a12e2f9cbfa107834ba7861a280499705ca256fbf0fac25d55545111b12e201f800aac749054c86d1b6c5e1d962a08590ae597e4887d9e290cf84de77158c"

RPROVIDES:${PN} += "deutex \
deutex(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
