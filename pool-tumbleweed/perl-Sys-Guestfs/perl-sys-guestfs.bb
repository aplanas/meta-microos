SUMMARY = "Perl bindings for libguestfs (Sys::Guestfs)"
DESCRIPTION = "perl-Sys-Guestfs contains Perl bindings for libguestfs (Sys::Guestfs)."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "perl-Sys-Guestfs-1.50.1-3.3.aarch64.rpm"
RPM_HASH = "db016616bd12b8e0e4b7bd9b5bb2f097aab2abd43b89542025e99cb5d2247472e64231e4e8a9c7aad907082d6a10fafd51390286a77fdc6080f6372770effd21"

RPROVIDES:${PN} += "perl-Sys--Guestfs \
perl-Sys-Guestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
