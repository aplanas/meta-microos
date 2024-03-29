SUMMARY = "Ruby/EventMachine library"
DESCRIPTION = "EventMachine implements a fast, single-threaded engine for arbitrary network \
communications. It's extremely easy to use in Ruby. EventMachine wraps all \
interactions with IP sockets, allowing programs to concentrate on the \
implementation of network protocols. It can be used to create both network \
servers and clients. To create a server or client, a Ruby program only needs \
to specify the IP address and port, and provide a Module that implements the \
communications protocol. Implementations of several standard network protocols \
are provided with the package, primarily to serve as examples. The real goal \
of EventMachine is to enable programs to easily interface with other programs \
using TCP/IP, especially if custom protocols are required."
LICENSE = "Ruby | GPL-2.0-only"

PV = "1.2.7"

RPM_NAME = "ruby3.2-rubygem-eventmachine-1.2.7-1.35.aarch64.rpm"
RPM_HASH = "555a337c7895ecc76b5909dc3b62ca58bb93a5d78b3a11e97ca274253db8433affb53f7864aa56e296ce4feec0ecba7036d76443059182357c902dec20566914"

RPROVIDES:${PN} += "ruby3.2-rubygem-eventmachine \
rubygem-eventmachine \
rubygem-ruby-3.2.0-eventmachine \
rubygem-ruby-3.2.0-eventmachine-1 \
rubygem-ruby-3.2.0-eventmachine-1.2 \
rubygem-ruby-3.2.0-eventmachine-1.2.7"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libruby3.2.so.3.2 \
libssl.so.3 \
libstdc++.so.6 \
ruby-abi"

inherit rpm
