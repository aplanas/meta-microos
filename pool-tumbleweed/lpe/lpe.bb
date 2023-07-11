SUMMARY = "Programming text editor"
DESCRIPTION = "LPE is meant as an acronym for 'lightweight programmer's editor'. \
It recognizes a few programming languages for syntax highlighting. \
The function keys are reminiscient of pico's choices."
LICENSE = "GPL-2.0-only"

PV = "1.2.8"

RPM_NAME = "lpe-1.2.8-5.6.aarch64.rpm"
RPM_HASH = "b2d6f1058b741d7570fbcd311ebb250718f443f7e3b672e57b21e2de3626afd771f08d06fc374bb0067a126d66d667302450b04babe8284d41b7792751fcfe09"

RPROVIDES:${PN} += "lpe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libslang.so.2 \
libtinfo.so.6"

inherit rpm
