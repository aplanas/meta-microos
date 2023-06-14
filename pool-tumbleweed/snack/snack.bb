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

RPM_NAME = "snack-2.2.10-215.8.aarch64.rpm"
RPM_HASH = "49c218a7b83487ee6700bd815870774bc8e63fc7ede05ae3ba1bd9d02a3cf99eaa3579bf1fd2f8c4d3e501f749991fbaa6516b5f830705d2f230824dc545d4f6"

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
