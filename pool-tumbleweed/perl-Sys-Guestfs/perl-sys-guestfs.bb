SUMMARY = "Perl bindings for libguestfs (Sys::Guestfs)"
DESCRIPTION = "perl-Sys-Guestfs contains Perl bindings for libguestfs (Sys::Guestfs)."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "perl-Sys-Guestfs-1.50.1-4.1.aarch64.rpm"
RPM_HASH = "a501c1ca3960fc2bda3f2a4a814528d60a9515684061ea23800eff8d7f64fa7db6489f042b3e79e210d8e84a550b376266f695bd732222283399e7e1375c77fa"

RPROVIDES:${PN} += "perl-Sys--Guestfs \
perl-Sys-Guestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
