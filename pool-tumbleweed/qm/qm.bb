SUMMARY = "QMTest--General Purpose Testing Solution"
DESCRIPTION = "QMTest is a cost-effective general purpose testing solution that can be \
used to implement a robust, easy to use testing process/"
LICENSE = "GPL-2.0+"

PV = "2.3"

RPM_NAME = "qm-2.3-220.21.aarch64.rpm"
RPM_HASH = "4b11578f3bf79056ae89413424e98cfb00518b7e0a1a2b47d15f068f1e903221ee8823218bbb0cf41b7b384b980a3bbd2b0a73a552a660a1892ff4e8de9587aa"

RPROVIDES:${PN} += "qm \
qm(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python2 \
libc.so.6()(64bit) \
libpython2.7.so.1.0()(64bit) \
python2-base \
python2-xml"

inherit rpm
