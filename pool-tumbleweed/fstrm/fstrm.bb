SUMMARY = "Frame Streams implementation in C"
DESCRIPTION = "fstrm is a C implementation of Frame Streams that includes a lockless \
circular queue implementation and exposes library interfaces for \
setting up a dedicated Frame Streams I/O thread and asynchronously \
submitting data frames for transport from worker threads. \
 \
Frame Streams is a protocol that allows for the transport of \
arbitrarily encoded data payload sequences with just 4 bytes per data \
frame. Frame Streams does not specify an encoding format for frames \
and can be used with data serialization formats that produces byte \
sequences, such as Protocol Buffers, XML, JSON, MessagePack, YAML, \
etc. Frame Streams can be used both as a streaming transport over a \
reliable byte stream socket (TCP, AF_UNIX, TLS, etc.) for data in \
motion, as well as a file format for data at rest. A 'Content Type' \
header identifies the type of payload being carried over an \
individual Frame Stream and allows cooperating programs to determine \
how to interpret a given sequence of data payloads."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "fstrm-0.6.1-1.5.aarch64.rpm"
RPM_HASH = "6e1d7a1768280ec50fb1b98d2b57fed270e89905ba41a0107a1811e2867c6e857613a27627761fdfd68efedf8def7de24fa7c4654d1b42fb74ba208f341f392f"

RPROVIDES:${PN} += "fstrm \
fstrm(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libevent-2.1.so.7()(64bit) \
libfstrm.so.0()(64bit)"

inherit rpm
