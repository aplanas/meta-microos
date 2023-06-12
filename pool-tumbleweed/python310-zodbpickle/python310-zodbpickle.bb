SUMMARY = "Fork of Python 3 pickle module"
DESCRIPTION = "This package presents a uniform pickling interface for ZODB: \
 * Under Python2, this package forks both Python 2.7’s pickle and \
   cPickle modules, adding support for the protocol 3 opcodes. \
   It also provides a new subclass of bytes, zodbpickle.binary, \
   which Python2 applications can use to pickle binary values such \
   that they will be unpickled as bytes under Py3k. \
 * Under Py3k, this package forks the pickle module (and the \
   supporting C extension) from both Python 3.2 and Python 3.3. \
   The fork add support for the noload operations used by ZODB."
LICENSE = "Python-2.0 & ZPL-2.1"

PV = "2.6"

RPM_NAME = "python310-zodbpickle-2.6-1.5.aarch64.rpm"
RPM_HASH = "0dece52754f5414270c116ac61d1d774ebf227cc977d5dec099d764e2482623bf674816e62e9a48ce6bce4b067682207d33417beb5a28008e838662cb9f43b1f"

RPROVIDES:${PN} += "python3-zodbpickle \
python3.10dist(zodbpickle) \
python310-zodbpickle \
python310-zodbpickle(aarch-64) \
python3dist(zodbpickle)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
