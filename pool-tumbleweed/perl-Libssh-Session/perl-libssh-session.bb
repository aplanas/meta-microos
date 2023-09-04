SUMMARY = "Support for the SSH protocol via libssh"
DESCRIPTION = "'Libssh::Session' is a perl interface to the libssh (http://www.libssh.org) \
library. It doesn't support all the library. It's working in progress. \
 \
Right now, you can authenticate and execute commands on a SSH server."
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "perl-Libssh-Session-0.8-1.4.aarch64.rpm"
RPM_HASH = "102e292ec2a9d01ec17921f1f78d6494fb47a1f07fc0b11a07991e7a797a4bb6b347191e1208ca9387af57237d6bebd2c73ec7696c91febf4302c3e8770326ca"

RPROVIDES:${PN} += "perl-Libssh--Session \
perl-Libssh--Sftp \
perl-Libssh-Session"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libssh.so.4 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
