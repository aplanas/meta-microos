SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.11.4"

RPM_NAME = "python311-curses-3.11.4-3.1.aarch64.rpm"
RPM_HASH = "290599b53f7ebc36d6e2a773ee761f586272a03a79dd0c18edd1f0f65c8b0155f8bee69242d15d6eb0310ec692bc184d4902cc7057bf1c9df8e683b18ebdfe29"

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
