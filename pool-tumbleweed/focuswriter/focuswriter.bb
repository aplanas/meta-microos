SUMMARY = "A fullscreen, distraction-free writing program"
DESCRIPTION = "A fullscreen, distraction-free writing program. You can customize your \
environment by changing the font, colors, and background image to add \
ambiance as you type. FocusWriter features an on-the-fly updating word \
count, optional auto-save, optional daily goals, and an interface that \
hides away to allow you to focus more clearly; additionally, when you open \
the program your current work-in-progress will automatically load and \
position you at the end of your document, so that you can immediately jump \
back in."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.4"

RPM_NAME = "focuswriter-1.8.4-1.3.aarch64.rpm"
RPM_HASH = "791561b1cb0215f6ebfb321c8fcef4ee657e5d5f8a329e1cd3129d0dc88aa1d05f4db94485593f97fe7cf7c87bce5a3257f0a4771c2b730a5c16252df24c0358"

RPROVIDES:${PN} += "focuswriter"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
update-desktop-files"

inherit rpm
