SUMMARY = "A Command Line Editor for ID3 V2 tags"
DESCRIPTION = "ID3 tags are found in MP3 files. They can store information about what band \
recorded the song, the song name, and more. ID3-V1 tags are seriously \
deficient as to the kind of and length of information that they can store. \
This is a tool for editing ID3-V2 tags in Linux."
LICENSE = "LGPL-2.1+"

PV = "0.1.12"

RPM_NAME = "id3v2-0.1.12-19.22.aarch64.rpm"
RPM_HASH = "c80557868df3f1b9b5bd0534cf9a03faf6a9015ca89af534518ede7c30d86ad413a3636ab812a201b7426a791ecc51fa5172637b817e314be2265921cbe2e538"

RPROVIDES:${PN} += "id3v2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libid3-3.8.so.3 \
libstdc++.so.6"

inherit rpm
