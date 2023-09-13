SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.11.5"

RPM_NAME = "python311-curses-3.11.5-1.1.aarch64.rpm"
RPM_HASH = "1f9599fc0de3aee2051100a1550d994d4614c7f4e8976321de17e20ccc15d1c7c69d4f2b6eecab866f299d7265e3ccf3286cfbc88d3dac73e465e80f658e7f66"

RPROVIDES:${PN} += "python3-curses \
python311-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python311"

inherit rpm
