SUMMARY = "Reading News Offline"
DESCRIPTION = "Suck is a program used to grab news from a remote NNTP news server and \
bring it to a local machine, without having the remote server do \
anything special."
LICENSE = "SUSE-Public-Domain"

PV = "4.3.4"

RPM_NAME = "suck-4.3.4-1.30.aarch64.rpm"
RPM_HASH = "79e722c5bd0f1d6c4175100ab57ae21825f301f2954afdfb316116ed497876529a792e28396c768116b07db409e5825e809a5e0e0b44d17a99a7c805567f383b"

RPROVIDES:${PN} += "suck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libssl.so.3 \
perl"

inherit rpm
