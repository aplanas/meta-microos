SUMMARY = "Write filesystems in Perl using FUSE"
DESCRIPTION = "This lets you implement filesystems in perl, through the FUSE (Filesystem \
in USErspace) kernel/lib interface."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.16.1"

RPM_NAME = "perl-Fuse-0.16.1-1.32.aarch64.rpm"
RPM_HASH = "e6524db6a40815e2655d0a4505e158ef67e06b9e4a601cc0da23cd3cb9ad6d5b1c695192413b0970c0ea5016b572215184706345eab7f07e1dbd4ea10cf778d3"

RPROVIDES:${PN} += "perl-Fuse"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
perl"

inherit rpm
