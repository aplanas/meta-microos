SUMMARY = "MP3 Format Validator"
DESCRIPTION = "mp3_check helps identifying, in detail, MP3 files that do not \
correctly follow the MPEG-1 Layer 3 format. It looks for invalid \
frame headers, missing frames, etc., and generates statistics. This \
can especially be important when building a file archive of a certain \
quality."
LICENSE = "GPL-2.0-or-later"

PV = "1.98"

RPM_NAME = "mp3_check-1.98-3.12.aarch64.rpm"
RPM_HASH = "edbeb6518a344fea191a242638a8fb53f00fd82aa4dbc9ed898d574ada129354ba86d582a5a9151bf1ed15381de6e3b6f94ba51ffba4e8c7b978d32bf4d567aa"

RPROVIDES:${PN} += "mp3-check"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
