SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.8.17"

RPM_NAME = "python38-tk-3.8.17-1.1.aarch64.rpm"
RPM_HASH = "a6a6605f6e81d472f7d35d86f5856946994ff00c28ac9f91d0f9c9255413d31e89b4d80476221329c8075395987372beb8a737c36e981ede18ed52054033397d"

RPROVIDES:${PN} += "python38-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python38"

inherit rpm
