SUMMARY = "Represent and manage a libvirt hypervisor connection"
DESCRIPTION = "The Sys::Virt module provides a Perl XS binding to the libvirt virtual \
machine management APIs. This allows machines running within arbitrary \
virtualization containers to be managed with a consistent API."
LICENSE = "ClArtistic | GPL-2.0-or-later"

PV = "9.4.0"

RPM_NAME = "perl-Sys-Virt-9.4.0-2.1.aarch64.rpm"
RPM_HASH = "26d42ab6a6a8b397348a73dc1ff0a7a25e6f89069cc040ce80e281ee05e6f15251146168f48f5b9205d32a959297c8540754162abaae9b5129caa42df9821abd"

RPROVIDES:${PN} += "perl-Sys--Virt \
perl-Sys--Virt--Domain \
perl-Sys--Virt--DomainCheckpoint \
perl-Sys--Virt--DomainSnapshot \
perl-Sys--Virt--Error \
perl-Sys--Virt--Event \
perl-Sys--Virt--Interface \
perl-Sys--Virt--NWFilter \
perl-Sys--Virt--NWFilterBinding \
perl-Sys--Virt--Network \
perl-Sys--Virt--NetworkPort \
perl-Sys--Virt--NodeDevice \
perl-Sys--Virt--Secret \
perl-Sys--Virt--StoragePool \
perl-Sys--Virt--StorageVol \
perl-Sys--Virt--Stream \
perl-Sys-Virt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libvirt.so.0 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
