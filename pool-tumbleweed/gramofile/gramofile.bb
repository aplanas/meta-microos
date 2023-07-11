SUMMARY = "Digitize Audio Records"
DESCRIPTION = "Gramofile is a program to digitize audio records. Through the \
application of several filters, it is possible to accomplish a \
significant reduction of disturbances like ticks and scratches. Data is \
saved in WAV format, making it easy to record on CD with programs like \
cdrecord or xcdroast."
LICENSE = "GPL-2.0+"

PV = "1.6"

RPM_NAME = "gramofile-1.6-397.26.aarch64.rpm"
RPM_HASH = "06a47718ab7fc0df529d452307f8874775841dc3ffdaf7b730ad72739a730372da8d21c334e840aa9ee7f12bd80c8cde42a90ea066ee73947a5b31f3c4e20724"

RPROVIDES:${PN} += "gramofil \
gramofile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
