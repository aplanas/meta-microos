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

RPM_NAME = "python311-pykafka-2.8.0-2.23.aarch64.rpm"
RPM_HASH = "adc298ff72de827cded4ccd778caae8dfe8b373283a0475a75f930a2910800aa70ac9b4684179462a1b48c1bca1391f2cdc52a754ae63ef073c1e12f33e4bdd6"

RPROVIDES:${PN} += "python3-pykafka \
python3.11dist-pykafka \
python311-pykafka \
python3dist-pykafka"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-gevent \
python311-kazoo \
python311-setuptools \
python311-six \
python311-tabulate"

inherit rpm
