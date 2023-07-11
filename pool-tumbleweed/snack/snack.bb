SUMMARY = "Sound Extension for Tcl/Tk"
DESCRIPTION = "Snack provides commands to play, record, process, and visualize sound. \
It supports various file formats such as WAV, AU, AIFF, and MP3. \
 \
With Snack, you can easily create sound applications with Tcl/Tk or \
Python or extend existing programs with sound capabilities. \
 \
The documentation is located under /usr/share/doc/packages/snack There \
is also a 'demos' subdirectory which contains examples for Tcl/Tk and \
Python. \
 \
 \
 \
Authors: \
-------- \
    Kåre Sjölander <kare@speech.kth.se>"
LICENSE = "GPL-2.0-or-later"

PV = "2.2.10"

RPM_NAME = "snack-2.2.10-215.9.aarch64.rpm"
RPM_HASH = "e324310fd162d46ac6a9ab44bcd4d3ffcb1877dc4d646bc8d04a242341aec761964d59b73db8c1a5ecf81c46c97e769b86447f86a86db2ed6a78f428d8337387"

RPROVIDES:${PN} += "libsnack.so \
libsnackogg.so \
libsound.so \
snack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libogg.so.0 \
libvorbis.so.0 \
libvorbisenc.so.2 \
tcl \
tk"

inherit rpm
