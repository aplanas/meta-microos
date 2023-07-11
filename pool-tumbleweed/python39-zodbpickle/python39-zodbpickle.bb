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

RPM_NAME = "python39-zodbpickle-2.6-1.7.aarch64.rpm"
RPM_HASH = "e0b92d92aa3440d0d2b0c4acacce036acfbf3849c617e4b61b493d128566cf0e6b7214fa53f6ee51dbc43b78ff4e906d781e46b3f5c81df79459f5e4845c94da"

RPROVIDES:${PN} += "python3.9dist-zodbpickle \
python39-zodbpickle \
python3dist-zodbpickle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
