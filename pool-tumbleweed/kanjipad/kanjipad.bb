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

RPM_NAME = "kanjipad-2.0.0-441.31.aarch64.rpm"
RPM_HASH = "9b2f5300d6aabc1362a507a9e6bd798ff9573e7725d97df2372a49726cd3f5f33e697d8ab0947d833ee164b6f0ef34225530af3a0084d1c3aeca43291a7234f2"

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
