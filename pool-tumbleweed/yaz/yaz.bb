SUMMARY = "Z39.50 protocol server and client"
DESCRIPTION = "This package contains both a test-server and clients (normal & ssl) for \
the ANSI/NISO Z39.50 protocol for Information Retrieval.  SRW and SRU \
clients and servers are also supported."
LICENSE = "BSD-3-Clause"

PV = "5.34.0"

RPM_NAME = "yaz-5.34.0-1.4.aarch64.rpm"
RPM_HASH = "5f83f8f3b6414370bd4b91ca663325926007c04cba7be6148731f926b6c9da00cc8cfbc3a05d5864eccbc54c11add4009ff6d12fa43a55f61c2f652ee9ac4c7e"

RPROVIDES:${PN} += "yaz \
yaz(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libreadline.so.8()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.7)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libyaz.so.5()(64bit) \
libyaz_icu.so.5()(64bit) \
libyaz_server.so.5()(64bit)"

inherit rpm
