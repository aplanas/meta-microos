SUMMARY = "A Command Line Editor for ID3 V2 tags"
DESCRIPTION = "ID3 tags are found in MP3 files. They can store information about what band \
recorded the song, the song name, and more. ID3-V1 tags are seriously \
deficient as to the kind of and length of information that they can store. \
This is a tool for editing ID3-V2 tags in Linux."
LICENSE = "LGPL-2.1+"

PV = "0.1.12"

RPM_NAME = "id3v2-0.1.12-19.21.aarch64.rpm"
RPM_HASH = "ec2b669c316d536b2adb78da984b47e0fcc5b92c302904b9b1b36b9841c74185e349a43a222646698d6151ef8114eee7c4ae32002d764609c42780d8ab557aa5"

RPROVIDES:${PN} += "id3v2 \
id3v2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libid3-3.8.so.3()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
