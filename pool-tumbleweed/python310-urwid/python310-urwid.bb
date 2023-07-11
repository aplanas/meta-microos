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

RPM_NAME = "python310-urwid-2.1.2-5.3.aarch64.rpm"
RPM_HASH = "6832e065732955919dc48beea27b47cf8ba9395c85366218db509b245394c174bbce65c09918a7e3ce683f7baed2ac6073e718fefd928af3834657791b1cf10f"

RPROVIDES:${PN} += "python3.10dist-urwid \
python310-urwid \
python3dist-urwid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-curses"

inherit rpm
