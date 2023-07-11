SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-curses-3.9.17-1.1.aarch64.rpm"
RPM_HASH = "db4c9e40a64105c5eac7006687ae1d1dcf2d7cb57e8596d18c7a0aaadc255c41c6e6143ed616a24a6aa1d6b920fa106ddc35071ffd047a6c6f0e3f948f3afeaa"

RPROVIDES:${PN} += "python39-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python39"

inherit rpm
