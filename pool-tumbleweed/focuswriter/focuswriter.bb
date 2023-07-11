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

PV = "1.8.5"

RPM_NAME = "focuswriter-1.8.5-1.1.aarch64.rpm"
RPM_HASH = "db23e039eefc5fde75b841a6a28086dfead3c3c3fc8a37af733e5afa17d2ee18f51b317c9d62e0df8d9649d312a5063f35b6da89a2ee51e2a5d5d78455547bdb"

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
