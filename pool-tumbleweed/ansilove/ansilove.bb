SUMMARY = "ANSI and ASCII art to PNG converter"
DESCRIPTION = "AnsiLove/C is a tool to convert ANSI and artscene-related file formats into \
PNG images. \
 \
The following formats are supported: \
 - .ANS - ANSi (ANSI escape sequences: ANSI X3.64 standard) \
 - .PCB - PCBoard Bulletin Board System (BBS) own file format \
 - .BIN - Binary format (raw memory copy of text mode video memory) \
 - .ADF - Artworx format, supporting custom character sets and palettes \
 - .IDF - iCE Draw format, supporting custom character sets and palettes \
 - .TND - TundraDraw format, supporting 24-bit color mode \
 - .XB  - The eXtended Binary XBin format, supporting custom character \
          sets and palettes"
LICENSE = "BSD-2-Clause"

PV = "4.1.7"

RPM_NAME = "ansilove-4.1.7-1.1.aarch64.rpm"
RPM_HASH = "f1998b1fd723348cf5d4c05afa0c3a6c2a49d618a84d25e664273992b8b5c6ceb1b8bf2dd1a0fa6784a46306aee43616d9d8faacebe4649ce1df19ea9f1e5be9"

RPROVIDES:${PN} += "ansilove \
ansilove(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libansilove.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
