SUMMARY = "Write filesystems in Perl using FUSE"
DESCRIPTION = "This lets you implement filesystems in perl, through the FUSE (Filesystem \
in USErspace) kernel/lib interface."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.16.1"

RPM_NAME = "perl-Fuse-0.16.1-1.31.aarch64.rpm"
RPM_HASH = "a6548b763e43314719424ae918aa24386163a5f38f276f02995bab574073d89c3a64f61119cc4323c18bec423dbcbbf83efb505f97e8f0b65bef72539dedfa59"

RPROVIDES:${PN} += "perl-Fuse"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
perl"

inherit rpm
