SUMMARY = "Python network library that uses greenlet and libevent"
DESCRIPTION = "Gevent is a Python networking library that uses greenlet to provide synchronous \
API on top of a libevent event loop. Features include: \
 \
  * Fast event loop based on libevent. \
  * Lightweight execution units based on greenlet. \
  * Familiar API that re-uses concepts from the Python standard library. \
  * Cooperative sockets with ssl support. \
  * DNS queries performed through libevent-dns. \
  * Ability to use standard library and 3rd party modules written for standard \
    blocking sockets \
  * Fast WSGI server based on libevent-http. \
 \
gevent is inspired by eventlet but features more consistent API, simpler \
implementation and better performance. Read why others use gevent and check \
out the list of the open source projects based on gevent."
LICENSE = "MIT"

PV = "22.10.2"

RPM_NAME = "python310-gevent-22.10.2-3.2.aarch64.rpm"
RPM_HASH = "c61e40d8a7bfdfe6ee4511e434a9c9528b5dce666796d03401df0e1cb94fae42d9aa3b0e7c83bfa4fe2c05c27d37f2f9d39dbb0cb1597e71eb356c3ca359afdc"

RPROVIDES:${PN} += "python3.10dist-gevent \
python310-gevent \
python3dist-gevent"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libev.so.4 \
python-abi \
python310-cffi \
python310-dnspython \
python310-greenlet \
python310-requests \
python310-zope.event \
python310-zope.interface"

inherit rpm
