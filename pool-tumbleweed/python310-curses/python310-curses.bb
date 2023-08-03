SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-curses-3.10.12-2.1.aarch64.rpm"
RPM_HASH = "b5b5efe30ae4771fac57111eeba6c9273f513f6dcd0457075055b78043d388936605a23eac25bf19c9315ee2105f59d928efb4cc69794da7830db190c8d4b3b6"

RPROVIDES:${PN} += "python310-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python310"

inherit rpm
