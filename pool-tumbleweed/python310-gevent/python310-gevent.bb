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

RPM_NAME = "python310-gevent-23.7.0-1.1.aarch64.rpm"
RPM_HASH = "76c3e449f206dc4626f29d643beaa06c486e18752e9c1dc22c7132987d04cc65ff2c3e390968b97c7045f50043f5fc8efcd2e6c61ed8b6362a0faa310df82341"

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
python310-importlib-metadata \
python310-requests \
python310-zope.event \
python310-zope.interface"

inherit rpm
