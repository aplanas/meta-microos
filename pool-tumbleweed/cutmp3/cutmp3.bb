SUMMARY = "Command line based lossless MP3 editor"
DESCRIPTION = "This is a program to split MP3 files without quality loss, using an \
ncurses-based user interface. Beginning and end of a segment can be \
marked with the 'a' and 'b' keys and the segment be saved with 's'. \
VBR files are supported. Using a timetable with VBR files will not be \
as precise as with CBR files, though."
LICENSE = "GPL-2.0+"

PV = "3.0.1"

RPM_NAME = "cutmp3-3.0.1-2.22.aarch64.rpm"
RPM_HASH = "434669d64abf8a2653e345209f5b8dfebc9fe51b3ad71cb483308ed9ce4130d0abda1a65de4b4eaac5731f69b47de00448f868164228e50d74c09db6f32cbad6"

RPROVIDES:${PN} += "cutmp3 \
cutmp3(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libreadline.so.8()(64bit) \
mpg123"

inherit rpm
