SUMMARY = "Z39.50 protocol server and client"
DESCRIPTION = "This package contains both a test-server and clients (normal & ssl) for \
the ANSI/NISO Z39.50 protocol for Information Retrieval.  SRW and SRU \
clients and servers are also supported."
LICENSE = "BSD-3-Clause"

PV = "5.34.0"

RPM_NAME = "yaz-5.34.0-1.4.aarch64.rpm"
RPM_HASH = "5f83f8f3b6414370bd4b91ca663325926007c04cba7be6148731f926b6c9da00cc8cfbc3a05d5864eccbc54c11add4009ff6d12fa43a55f61c2f652ee9ac4c7e"

RPROVIDES:${PN} += "yaz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libicui18n.so.73 \
libicuuc.so.73 \
libreadline.so.8 \
libxml2.so.2 \
libyaz-icu.so.5 \
libyaz-server.so.5 \
libyaz.so.5"

inherit rpm
