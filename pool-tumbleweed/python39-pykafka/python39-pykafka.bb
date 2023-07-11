SUMMARY = "Full-Featured Pure-Python Kafka Client"
DESCRIPTION = "PyKafka is a cluster-aware Kafka>=0.8.2 client for Python. It includes Python \
implementations of Kafka producers and consumers, which are optionally backed \
by a C extension built on `librdkafka`_, and runs under Python 2.7+, Python 3.4+, \
and PyPy. \
 \
.. _librdkafka: https://github.com/edenhill/librdkafka \
 \
PyKafka's primary goal is to provide a similar level of abstraction to the \
`JVM Kafka client`_ using idioms familiar to Python programmers and exposing \
the most Pythonic API possible."
LICENSE = "Apache-2.0"

PV = "2.8.0"

RPM_NAME = "python39-pykafka-2.8.0-2.23.aarch64.rpm"
RPM_HASH = "883df9d007bb0b12aa838ca83994d6741c2492742e021e85f8b5dd43ac071d861d113ad6100e6c289ed9b745d57ce09e22ea9d57dc3147c14c209d176635213d"

RPROVIDES:${PN} += "python3.9dist-pykafka \
python39-pykafka \
python3dist-pykafka"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-gevent \
python39-kazoo \
python39-setuptools \
python39-six \
python39-tabulate"

inherit rpm
