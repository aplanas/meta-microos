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

RPM_NAME = "python311-pykafka-2.8.0-2.21.aarch64.rpm"
RPM_HASH = "f06e448b27c7cca05741d1ea02092995c5206ece18dc340bc66bf8d4b74018463a54d6210b9f16856eb113247d247fd057ea796d2f7a4cbfa23833ee8a85a39d"

RPROVIDES:${PN} += "python3.11dist-pykafka \
python311-pykafka \
python3dist-pykafka"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-gevent \
python311-kazoo \
python311-setuptools \
python311-six \
python311-tabulate"

inherit rpm
