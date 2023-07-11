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

RPM_NAME = "python310-zodbpickle-2.6-1.7.aarch64.rpm"
RPM_HASH = "471a15efccc4bc96eb212c4ffbf6cbbc60c38740e96affe2eef248a8f2c2cc0b6ae5c7738d6802e06022014f3401177fd6556c37b01d76b7118e865c9d88fa10"

RPROVIDES:${PN} += "python3.10dist-zodbpickle \
python310-zodbpickle \
python3dist-zodbpickle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
