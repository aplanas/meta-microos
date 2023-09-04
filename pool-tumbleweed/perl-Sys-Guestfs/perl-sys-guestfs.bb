SUMMARY = "Perl bindings for libguestfs (Sys::Guestfs)"
DESCRIPTION = "perl-Sys-Guestfs contains Perl bindings for libguestfs (Sys::Guestfs)."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "perl-Sys-Guestfs-1.50.1-4.2.aarch64.rpm"
RPM_HASH = "d109e1760b9488cf4f2a57290b1057c6fb28019e07368f8a2831b9b0a65fc99eb1e7411ec6ee3dd71d7420510777e74d3b76d5d0673379220cd36ae0994f3b46"

RPROVIDES:${PN} += "perl-Sys--Guestfs \
perl-Sys-Guestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
