SUMMARY = "Perl bindings for libguestfs (Sys::Guestfs)"
DESCRIPTION = "perl-Sys-Guestfs contains Perl bindings for libguestfs (Sys::Guestfs)."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "perl-Sys-Guestfs-1.50.1-3.1.aarch64.rpm"
RPM_HASH = "f7a447b63353ea7a0eabe3cbf1f8e2427e4554036020d0f304aa7a10fc0b87f376572f0507bd590de6725bdc8ef03bfdd3adeb983d802a099730a23d250f9ef8"

RPROVIDES:${PN} += "perl-Sys--Guestfs \
perl-Sys-Guestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
