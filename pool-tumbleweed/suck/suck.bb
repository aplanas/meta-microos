SUMMARY = "Reading News Offline"
DESCRIPTION = "Suck is a program used to grab news from a remote NNTP news server and \
bring it to a local machine, without having the remote server do \
anything special."
LICENSE = "SUSE-Public-Domain"

PV = "4.3.4"

RPM_NAME = "suck-4.3.4-1.29.aarch64.rpm"
RPM_HASH = "cf70c7d3e562cd1ef8063f48e9241d865f81526a8e00c42df3f03b9566d999764051a27f9d47043b1f2725598921b210a7170be33eeb4352d45d1046d920cdc6"

RPROVIDES:${PN} += "suck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libssl.so.3 \
perl"

inherit rpm
