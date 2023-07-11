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

RPM_NAME = "python311-zodbpickle-2.6-1.7.aarch64.rpm"
RPM_HASH = "4d85beb5ca0e07efb59347bc4da04b583418e24d1ee790593cb2d07b105e48f94f47d18e159853b877ed144f507920f56cec4ecf1f512179a5746088449954fe"

RPROVIDES:${PN} += "python3-zodbpickle \
python3.11dist-zodbpickle \
python311-zodbpickle \
python3dist-zodbpickle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
