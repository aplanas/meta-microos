SUMMARY = "Colored Emoji Font"
DESCRIPTION = "A color and B&W emoji SVGinOT font built from EmojiOne artwork with support \
for ZWJ, skin tone diversity and country flags. \
 \
The font works in all operating systems, but will currently only show color \
emoji in Firefox, Thunderbird and other Mozilla Gecko-based applications. \
This is not a limitation of the font, but of the operating systems and \
applications. Regular B&W outline emoji are included for backwards/fallback \
compatibility."
LICENSE = "CC-BY-4.0"

PV = "1.3"

RPM_NAME = "emojione-color-font-1.3-2.14.noarch.rpm"
RPM_HASH = "fd95acc993030b48b18909af67770210337976987f582b3174c74d077969a043adcf4b17a7722dbb0500ed86b8ef6654c59197091cb75c9cfffab99d05945e3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emojione-color-font"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
