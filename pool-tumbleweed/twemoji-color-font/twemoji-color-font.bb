SUMMARY = "Font using Twitter’s color emoji"
DESCRIPTION = "A color and monochrome emoji SVG-in-OpenType font built from the \
Twitter Emoji for Everyone artwork with support for ZWJ, \
skin tone diversity and country flags. \
 \
The font works in all operating systems, but will currently only \
show color emoji in Firefox, Thunderbird and other Mozilla Gecko-based \
applications. This is not a limitation of the font but of the \
operating systems and applications. Regular monochrome outline \
emoji are included for backwards/fallback compatibility."
LICENSE = "CC-BY-4.0"

PV = "14.0.2"

RPM_NAME = "twemoji-color-font-14.0.2-1.2.noarch.rpm"
RPM_HASH = "c02cef615b8ea33f2bbf85c215e217a1c88cbf05030d63dbed06160f55005ed2ea488a89cb96fbf87135e99a9926d03bb0c39c6b7e033e992e2507c4f592b86e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "twemoji-color-font"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
