SUMMARY = "Tools to work with ZeroMQ"
DESCRIPTION = "The ZeroMQ messaging kernel is a library extending the standard \
socket interfaces with an abstraction of asynchronous message queues, \
multiple messaging patterns, message filtering (subscriptions) and \
seamless access to multiple transport protocols. \
 \
This package contains the utilities to work with ZeroMQ library."
LICENSE = "LGPL-3.0-or-later"

PV = "4.3.4"

RPM_NAME = "zeromq-tools-4.3.4-4.4.aarch64.rpm"
RPM_HASH = "0709c9bf3b70c593a57388b7972365edc433942c478a96d96e6438031ed1fe13657ffd04632df11524ef9f40a796ff56922d8110823195ba160222c9914bca9e"

RPROVIDES:${PN} += "zeromq-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5"

inherit rpm
