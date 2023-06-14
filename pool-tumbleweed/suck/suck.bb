SUMMARY = "Reading News Offline"
DESCRIPTION = "Suck is a program used to grab news from a remote NNTP news server and \
bring it to a local machine, without having the remote server do \
anything special."
LICENSE = "SUSE-Public-Domain"

PV = "4.3.4"

RPM_NAME = "suck-4.3.4-1.27.aarch64.rpm"
RPM_HASH = "b91b13aededc15f0b11f61c705e36692f071d2660d3636ae979ada77cd277c38ad1c732db885de12eaf7621d953163cca2df42adf3b0bb86902189df65be97e2"

RPROVIDES:${PN} += "suck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libssl.so.3 \
perl"

inherit rpm
