SUMMARY = "Library for SAS SMP control of expanders"
DESCRIPTION = "The smp_utils package contains utilities for the Serial Attached SCSI \
(SAS) Management Protocol (SMP). \
 \
This subpackage holds the library of shared functions."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.99"

RPM_NAME = "libsmputils1-1-0.99-2.10.aarch64.rpm"
RPM_HASH = "4c6080dfbfd1d0cd6154aa204020f401f4d4e0c0b7cb74ca3a72ef3fddf48e322b8142b324edfab4845ce611587265330ef7e7e9ebefcbc78a50b6d8241663f3"

RPROVIDES:${PN} += "libsmputils1-1 \
libsmputils1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
