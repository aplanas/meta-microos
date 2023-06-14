SUMMARY = "Japanese Handwriting Recognition"
DESCRIPTION = "KanjiPad is a very simple program for handwriting recognition. The user \
draws a character into the box, then requests translation. The best \
candidates are displayed along the right hand side of the window and \
can be selected for pasting into other programs. \
 \
It is meant primarily for dictionary purposes for learners of Japanese. \
It does not support entering kana, so its usefulness as an input method \
is limited. Furthermore, if you already know the reading of a \
character, conventional pronunciation-based methods of entering the \
character are probably faster. \
 \
However, KanjiPad is sometimes useful for entering very unusual \
characters, even if the pronunciation is known, because \
pronunciation-based input methods often fail for rarely used \
characters."
LICENSE = "GPL-2.0+"

PV = "2.0.0"

RPM_NAME = "kanjipad-2.0.0-441.30.aarch64.rpm"
RPM_HASH = "793abd47b16ab15c87bca474b24485475350f98772f955c508bd4757323698b8d32541bcc1d5d133bb7fbc2a85d231776828c3f0749e6a68c6986713300a73a4"

RPROVIDES:${PN} += "kanjipad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
