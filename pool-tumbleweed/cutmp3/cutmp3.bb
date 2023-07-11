SUMMARY = "Command line based lossless MP3 editor"
DESCRIPTION = "This is a program to split MP3 files without quality loss, using an \
ncurses-based user interface. Beginning and end of a segment can be \
marked with the 'a' and 'b' keys and the segment be saved with 's'. \
VBR files are supported. Using a timetable with VBR files will not be \
as precise as with CBR files, though."
LICENSE = "GPL-2.0+"

PV = "3.0.1"

RPM_NAME = "cutmp3-3.0.1-2.23.aarch64.rpm"
RPM_HASH = "04f3a389c5e6c53e4adf9ff884da6b1bc30249fae3873f1209bb6d988b397ae277a9ca03b6c324c53d532af06a74ebad7078069d39b0d7eaabc20f3df2c9eaa7"

RPROVIDES:${PN} += "cutmp3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libreadline.so.8 \
mpg123"

inherit rpm
