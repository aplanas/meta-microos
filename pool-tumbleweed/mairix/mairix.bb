SUMMARY = "A maildir indexer and searcher"
DESCRIPTION = "mairix is a tool for indexing email messages stored in maildir format \
folders and performing fast searches on the resulting index.  The \
output is a new maildir folder containing symbolic links to the matched \
messages."
LICENSE = "GPL-2.0"

PV = "0.24"

RPM_NAME = "mairix-0.24-1.12.aarch64.rpm"
RPM_HASH = "5def1c32b6def53c13b4fe27ec6ef74d04aa4a70862b367212f350c5995671009489895485f0494f260b67632f251b29c08d7fa966baa763dd37e1574dcaa1d3"

RPROVIDES:${PN} += "mairix \
mairix(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
