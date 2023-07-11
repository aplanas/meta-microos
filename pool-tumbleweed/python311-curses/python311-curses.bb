SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.11.4"

RPM_NAME = "python311-curses-3.11.4-1.1.aarch64.rpm"
RPM_HASH = "a803d0645839043e5202feebed6aa67f1a48ee83a2fddc3c6715e062cc5dedf5a525dd49cbff5ce068770374dd4c4fece6d04489b4684e8f71876fc43f20420d"

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
