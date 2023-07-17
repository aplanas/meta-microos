SUMMARY = "Utilities to inspect Common Log File Systems"
DESCRIPTION = "This subpackage provides the utilities from libfsclfs, which allows for \
reading Common Log File Systems (CLFS)."
LICENSE = "LGPL-3.0-or-later"

PV = "20210417"

RPM_NAME = "libfsclfs-tools-20210417-3.6.aarch64.rpm"
RPM_HASH = "7444b0aae6c5c14aee6e70c2276cf6ba71d3bd762699a5b51cc3255c871b13b557ac8c20a4e44a4c6c4be7e0d280023658154a5de9d90bf88befd53b52b432e7"

RPROVIDES:${PN} += "libfsclfs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfsclfs.so.1 \
libftxf.so.1 \
libftxr.so.1"

inherit rpm
