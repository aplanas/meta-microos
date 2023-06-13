SUMMARY = "Write filesystems in Perl using FUSE"
DESCRIPTION = "This lets you implement filesystems in perl, through the FUSE (Filesystem \
in USErspace) kernel/lib interface."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.16.1"

RPM_NAME = "perl-Fuse-0.16.1-1.30.aarch64.rpm"
RPM_HASH = "d76186e3e0f45f5e06576be50e51c50a1f1d904d071db478538c4909e02cac755f57b9d0f25b1dd830616a3624c100d331b38e679bcb305df6e4dad8d100a877"

RPROVIDES:${PN} += "perl(Fuse) \
perl-Fuse \
perl-Fuse(aarch-64)"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfuse.so.2()(64bit) \
perl"

inherit rpm
