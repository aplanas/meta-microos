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

RPROVIDES:${PN} += "libsnack.so()(64bit) \
libsnackogg.so()(64bit) \
libsound.so()(64bit) \
snack \
snack(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libogg.so.0()(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit) \
tcl \
tk"

inherit rpm
