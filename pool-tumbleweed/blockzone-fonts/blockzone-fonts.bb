SUMMARY = "A faithful recreation of the original DOS font"
DESCRIPTION = "BlockZone is a faithful, pixel-perfect recreation of the original IBM VGA font. \
It contains each of the 256 characters, including those in the 128-255 range, \
referred to as extended ASCII. \
BlockZone is capabable of rendering ANSI and ASCII art, in fact that is the \
purpose it was created for. It supports a wide range of codepages, the legendary \
codepage 437 (MS-DOS Latin US) as well as Baltic, Cyrillic, French Canadian, \
Greek, Hebrew, Icelandic, Latin-1, Latin-2, Nordic, Portuguese, Turkish charsets, \
Windows codepage 1252 and even more. \
All characters are mapped to their Unicode equivalents. You get the best results \
when anti-aliasing (font smoothing) is disabled."
LICENSE = "OFL-1.1"

PV = "1.004"

RPM_NAME = "blockzone-fonts-1.004-1.10.noarch.rpm"
RPM_HASH = "1b7d1fdc94899fb6118627a86500df4c6e3b803aaa030af06e8ba1b71f0be01de3ef6961b7b5e9cc8fa411962b865c4645e24066430b6ec2572e4f8689c0d927"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blockzone-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
