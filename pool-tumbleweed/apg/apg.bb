SUMMARY = "Tool Set for Random Password Generation"
DESCRIPTION = "APG (Automated Password Generator) is a tool set for generating random \
passwords. A standalone tool generates some random words of the required type \
and prints them to standard output. A networked client/server following RFC972 \
is also provided."
LICENSE = "BSD-3-Clause"

PV = "2.2.3"

RPM_NAME = "apg-2.2.3-1.25.aarch64.rpm"
RPM_HASH = "cb952730fb67338dafa39ad80d38f8eab56bcbae47c599c15de179ac4d3a32c56f943d4cae3d7acce24ede3f0cfc69f17ed5bf18497ff656eb51eb06ae4f7d2a"

RPROVIDES:${PN} += "apg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libm.so.6"

inherit rpm
