SUMMARY = "Font with Basic Icon Glyphs"
DESCRIPTION = "Unidings contains glyphs that may be used in a Last Resort font, as well as \
icon glyphs for control and special characters, encoded in F200..F3B4 and \
F400..F5B4 of the Private Use Area in BMP. Block names are from “Roadmaps, \
a snapshot as of 2011-05-30”, http://std.dkuug.dk/JTC1/SC2/WG2/docs/n4056.htm"
LICENSE = "SUSE-Permissive"

PV = "9.17"

RPM_NAME = "gdouros-unidings-fonts-9.17-1.18.noarch.rpm"
RPM_HASH = "fa6821a101d127469adf0c6c6062955fca8186b37939bb057ccca18db9e57090dd3c1d0744fbc78fbc7e40dc01bdc2ad1d273d7af0de5800192ba14903146fbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdouros-unidings-fonts \
unidings-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
