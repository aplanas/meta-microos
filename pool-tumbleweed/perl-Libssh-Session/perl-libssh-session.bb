SUMMARY = "Support for the SSH protocol via libssh"
DESCRIPTION = "'Libssh::Session' is a perl interface to the libssh (http://www.libssh.org) \
library. It doesn't support all the library. It's working in progress. \
 \
Right now, you can authenticate and execute commands on a SSH server."
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "perl-Libssh-Session-0.8-1.3.aarch64.rpm"
RPM_HASH = "da74a49859280d06a0b6780797bf5d8effa89d6da6694915bf3ff75ef23b5c8e495c452258a483f54d3e76481baa9017d2a4b0372c7465397dbf51cd544fbf21"

RPROVIDES:${PN} += "perl-Libssh--Session \
perl-Libssh--Sftp \
perl-Libssh-Session"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libssh.so.4 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
