SUMMARY = "Utilities to inspect Resilient File Systems"
DESCRIPTION = "This subpackage provides the utilities from libfsrefs, which allows for \
reading Resilient File System (ReFS)."
LICENSE = "LGPL-3.0-or-later"

PV = "20210422"

RPM_NAME = "libfsrefs-tools-20210422-3.5.aarch64.rpm"
RPM_HASH = "e82411af6f5d26864e187e4deb8a4e66545a0793628deed7b9878358f38f17d435acae3735a68036caf8682d6afbf5442f527ad706ca600e54cf111b734a598c"

RPROVIDES:${PN} += "libfsrefs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfsrefs.so.1"

inherit rpm
