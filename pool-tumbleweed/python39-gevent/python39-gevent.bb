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

RPM_NAME = "python39-gevent-22.10.2-3.2.aarch64.rpm"
RPM_HASH = "ab3aa2d23afc983156f4b708fdc7f3701fa61cf3cdf11e8975f16ffca8e1d10e8a6f0520f33b3a423e9a3dc9dbfe14ffbf5c26ad97d900ac06546c96639ddfc4"

RPROVIDES:${PN} += "python3.9dist-gevent \
python39-gevent \
python3dist-gevent"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libev.so.4 \
python-abi \
python39-cffi \
python39-dnspython \
python39-greenlet \
python39-requests \
python39-zope.event \
python39-zope.interface"

inherit rpm
