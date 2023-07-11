SUMMARY = "Represent and manage a libvirt hypervisor connection"
DESCRIPTION = "The Sys::Virt module provides a Perl XS binding to the libvirt virtual \
machine management APIs. This allows machines running within arbitrary \
virtualization containers to be managed with a consistent API."
LICENSE = "ClArtistic | GPL-2.0-or-later"

PV = "9.4.0"

RPM_NAME = "perl-Sys-Virt-9.4.0-1.2.aarch64.rpm"
RPM_HASH = "3307bcdcf80d5f0b4554d3b49326e9d6444f8bda45edb408bb097718a2cf54fb1b91bf4614fa38ba49f2a754ec9fa80b7aa15724820b35596cfea22ae096fbce"

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
