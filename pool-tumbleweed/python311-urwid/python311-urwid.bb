SUMMARY = "A full-featured console (xterm et al.) user interface library"
DESCRIPTION = "Urwid is a console user interface library.  It includes many features \
useful for text console application developers including: \
- Applications resize quickly and smoothly \
- Automatic, programmable text alignment and wrapping \
- Simple markup for setting text attributes within blocks of text \
- Powerful list box with programmable content for scrolling all widget types \
- Your choice of event loops: Twisted, Glib or built-in select-based loop \
- Pre-built widgets include edit boxes, buttons, check boxes and radio buttons \
- Display modules include raw, curses, and experimental LCD and web displays \
- Support for UTF-8, simple 8-bit and CJK encodings \
- 256 and 88 color mode support \
- Python 3.2 support"
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.2"

RPM_NAME = "python311-urwid-2.1.2-5.3.aarch64.rpm"
RPM_HASH = "2967da8a9e4e432ad484e7a1eff017fab075df2c9be84012240cf9040c19ef9ac35a7294887184617319b4cc1ac6d0cd8a6a34c92f408e9941bedfc3ce2f98fb"

RPROVIDES:${PN} += "python3-urwid \
python3.11dist-urwid \
python311-urwid \
python3dist-urwid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-curses"

inherit rpm
