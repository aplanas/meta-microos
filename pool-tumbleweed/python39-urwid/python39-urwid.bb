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

RPM_NAME = "python39-urwid-2.1.2-5.1.aarch64.rpm"
RPM_HASH = "f8ade9c1cd2a381dba3bd1ceaa442bc9d6923bd35ddef3c432a6c5ed606bd0f7ba429b358a82cca9112fd6cd671a9e8f79a905f107f6823b0ba023323b10fc64"

RPROVIDES:${PN} += "python3.9dist-urwid \
python39-urwid \
python3dist-urwid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-curses"

inherit rpm
