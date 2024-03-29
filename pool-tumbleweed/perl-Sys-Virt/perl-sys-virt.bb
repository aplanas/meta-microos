SUMMARY = "Represent and manage a libvirt hypervisor connection"
DESCRIPTION = "The Sys::Virt module provides a Perl XS binding to the libvirt virtual \
machine management APIs. This allows machines running within arbitrary \
virtualization containers to be managed with a consistent API."
LICENSE = "ClArtistic | GPL-2.0-or-later"

PV = "9.7.0"

RPM_NAME = "perl-Sys-Virt-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "dc9dcc9c4b04267202978bb86a4343bf357c0a13bb564080c5b6abee1fd22f7700a3b0ea662f132bb969c7f72b53476b75769d00716843ee2be5ca34aeed9b4c"

RPROVIDES:${PN} += "perl-Sys--Virt \
perl-Sys--Virt--Domain \
perl-Sys--Virt--DomainCheckpoint \
perl-Sys--Virt--DomainSnapshot \
perl-Sys--Virt--Error \
perl-Sys--Virt--Event \
perl-Sys--Virt--EventImpl \
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
perl--MODULE-COMPAT-5.38.0"

inherit rpm
