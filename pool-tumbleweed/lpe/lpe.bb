SUMMARY = "Programming text editor"
DESCRIPTION = "LPE is meant as an acronym for 'lightweight programmer's editor'. \
It recognizes a few programming languages for syntax highlighting. \
The function keys are reminiscient of pico's choices."
LICENSE = "GPL-2.0-only"

PV = "1.2.8"

RPM_NAME = "lpe-1.2.8-5.5.aarch64.rpm"
RPM_HASH = "3433a2d8d49a51f279f36f6802188499665dc3e8094e06f2016f4f7dc7f05ca86bc63423ce3cc109d1df55dfed3815137a051e5fdc4532d3f2fe7f6414b1b05a"

RPROVIDES:${PN} += "lpe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libslang.so.2 \
libtinfo.so.6"

inherit rpm
