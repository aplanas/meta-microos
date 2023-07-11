SUMMARY = "Client package for the Hylafax server"
DESCRIPTION = "This is client part of the Hylafax fax server. If the Hylafax fax \
server is already running on another machine, this package can be \
used to access the server."
LICENSE = "BSD-3-Clause"

PV = "7.0.7"

RPM_NAME = "hylafax+-client-7.0.7-1.6.aarch64.rpm"
RPM_HASH = "8a32556848783a76d0b606d0550d9619e096449f709abde99ff9a0461f881dc27fbd63674d01cd04427d0a4e59bac812dc65dcb0efdfe68688fba2c6addf4e9b"

RPROVIDES:${PN} += "config-hylafax+-client \
hylafax+-client \
hylafax-client"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfaxutil.so.7.0.7 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
