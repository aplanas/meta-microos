SUMMARY = "Support for the SSH 2 protocol via libssh2"
DESCRIPTION = "Net::SSH2 is a Perl interface to the libssh2 (http://www.libssh2.org) \
library. It supports the SSH2 protocol (there is no support for SSH1) with \
all of the key exchanges, ciphers, and compression of libssh2. \
 \
Even if the module can be compiled and linked against very old versions of \
the library, nothing below 1.5.0 should really be used (older versions were \
quite buggy and unreliable) and version 1.7.0 or later is recommended."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.73"

RPM_NAME = "perl-Net-SSH2-0.73-1.5.aarch64.rpm"
RPM_HASH = "228b329b1832ecc4b54885534209356a523dab235f1475b2ac90f75c47a4685d493acbd00157a80c18e5aad5f84a40c6b9a6972e74fb07a0433cbcd63a92f8e0"

RPROVIDES:${PN} += "perl-Net--SSH2 \
perl-Net--SSH2--Channel \
perl-Net--SSH2--Dir \
perl-Net--SSH2--File \
perl-Net--SSH2--KnownHosts \
perl-Net--SSH2--Listener \
perl-Net--SSH2--PublicKey \
perl-Net--SSH2--SFTP \
perl-Net-SSH2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libssh2.so.1 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
