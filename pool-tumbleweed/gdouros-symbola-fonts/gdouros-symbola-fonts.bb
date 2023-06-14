SUMMARY = "Font with Support for Symbol Blocks of the Unicode Standard"
DESCRIPTION = "Symbola covers the following scripts and symbols supported by Unicode: Basic Latin, IPA Extensions, Spacing Modifier Letters, Combining Diacritical Marks, Greek and Coptic, Cyrillic, Cyrillic Supplement, General Punctuation, Superscripts and Subscripts, Currency Symbols, Combining Diacritical Marks for Symbols, Letterlike Symbols, Number Forms, Arrows, Mathematical Operators, Miscellaneous Technical, Control Pictures, Optical Character Recognition, Box Drawing, Block Elements, Geometric Shapes, Miscellaneous Symbols, Dingbats, Miscellaneous Mathematical Symbols-A, Supplemental Arrows-A, Supplemental Arrows-B, Miscellaneous Mathematical Symbols-B, Supplemental Mathematical Operators, Miscellaneous Symbols and Arrows, Supplemental Punctuation, Yijing Hexagram Symbols, Combining Half Marks, Specials, Byzantine Musical Symbols, Musical Symbols, Ancient Greek Musical Notation, Tai Xuan Jing Symbols, Counting Rod Numerals, Mathematical Alphanumeric Symbols, Mahjong Tiles, Domino Tiles, Playing Cards, Miscellaneous Symbols And Pictographs, Emoticons, Transport And Map Symbols, Alchemical Symbols, et al."
LICENSE = "SUSE-Permissive"

PV = "10.23"

RPM_NAME = "gdouros-symbola-fonts-10.23-2.7.noarch.rpm"
RPM_HASH = "e08681ae59d0ea9db1839a856675287073f7ec0e83396b71607402df5ef26d97dc3f994d92601085a325a3bef2f0beb467079470198803b9076d04ef77c46f17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdouros-symbola-fonts \
symbola-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
