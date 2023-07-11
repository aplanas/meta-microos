SUMMARY = "A maildir indexer and searcher"
DESCRIPTION = "mairix is a tool for indexing email messages stored in maildir format \
folders and performing fast searches on the resulting index.  The \
output is a new maildir folder containing symbolic links to the matched \
messages."
LICENSE = "GPL-2.0"

PV = "0.24"

RPM_NAME = "mairix-0.24-1.13.aarch64.rpm"
RPM_HASH = "5b0efd9301aa89bb934731f665bc0a0acdbeaad6a83184d8ee7da2761f37b3ca5cc1a52b9e794741dff5f09f581d0f37e3e9b3e2edaf6e1e379dbadde838f451"

RPROVIDES:${PN} += "mairix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
