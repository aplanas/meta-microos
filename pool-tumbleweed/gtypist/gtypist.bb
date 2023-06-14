SUMMARY = "Universal typing tutor"
DESCRIPTION = "GNU Typist (typist) is a universal typing tutor. You can learn \
correct typing and improve your skills by practising its exercises on \
a regular basis. Its main features are: \
 \
* It comes with several typing tutorials: in Czech, English (Qwerty, \
  Dvorak and Colemak keyboards), Russian and Spanish, as well as \
  simpler exercises in German, French and Norwegian. \
 \
* It interprets a simple and intuitive scripting language that \
  describes typing tutorials. You can easily modify existing \
  tutorials or create new ones according to your needs. \
 \
* Users can navigate through lessons through an easy to use arrow key \
  based menu interface. 'vi' up, down, left and right keys can be \
  used too."
LICENSE = "GPL-3.0-only"

PV = "2.9.5"

RPM_NAME = "gtypist-2.9.5-3.10.aarch64.rpm"
RPM_HASH = "8b2d88a6a3b0351edc594af79220321df5f5dee1a96d3f5474d4c3274ba03cfc211678e6c80addbfb94e5d8902df9ba148d5a11a84c9d9a8e9b4ca27dbeaae96"

RPROVIDES:${PN} += "gtypist"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
