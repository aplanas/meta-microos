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

PV = "4.2.0"

RPM_NAME = "ansilove-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "92ce0f28ce2e79170de0fd878e1e160edb828b6945c8c4409c4428fc39f9c6baebc9cfb9507bc589b82338283387efb58ce3fadf982cd7a53dd901f4b71ee6af"

RPROVIDES:${PN} += "ansilove"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libansilove.so.1 \
libc.so.6"

inherit rpm
