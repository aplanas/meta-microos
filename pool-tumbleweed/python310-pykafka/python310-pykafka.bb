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

RPM_NAME = "python310-pykafka-2.8.0-2.23.aarch64.rpm"
RPM_HASH = "691192d14e0a4c4805350e1d1601cd3c6c6c7055239406b5380831e019ba2448edaa8e816010128c53ec54577c32525c1f6a0ebe25f69bb13cdcd8252eb49e54"

RPROVIDES:${PN} += "python3.10dist-pykafka \
python310-pykafka \
python3dist-pykafka"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-gevent \
python310-kazoo \
python310-setuptools \
python310-six \
python310-tabulate"

inherit rpm
