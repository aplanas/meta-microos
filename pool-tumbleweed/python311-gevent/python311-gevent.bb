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

PV = "23.7.0"

RPM_NAME = "python311-gevent-23.7.0-1.1.aarch64.rpm"
RPM_HASH = "9be0b8aacbda632da4a93a312529276d7465d2d077e28376890b83e4b90f9681f198df31494bf6d30dd796fc92fffe5a22bc06fb242cfdfc4eafee5e5ce571db"

RPROVIDES:${PN} += "python3-gevent \
python3.11dist-gevent \
python311-gevent \
python3dist-gevent"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libev.so.4 \
python-abi \
python311-cffi \
python311-dnspython \
python311-greenlet \
python311-importlib-metadata \
python311-requests \
python311-zope.event \
python311-zope.interface"

inherit rpm
