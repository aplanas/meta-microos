SUMMARY = "Patch perl source a la Devel::PPPort's buildperl.pl"
DESCRIPTION = "Devel::PatchPerl is a modularisation of the patching code contained in \
Devel::PPPort's 'buildperl.pl'. \
 \
It does not build perls, it merely provides an interface to the source \
patching functionality."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.08"

RPM_NAME = "perl-Devel-PatchPerl-2.08-1.12.aarch64.rpm"
RPM_HASH = "731be7f6e270b681fe007ff7ff57da59936b102ef87e6a1f14eaee1c4f83d5263b371da378ae5ef3be538e1df5f8a72bbbae896ccd5d9781110c15947ade605c"

RPROVIDES:${PN} += "perl-Devel--PatchPerl \
perl-Devel--PatchPerl--Hints \
perl-Devel--PatchPerl--Plugin \
perl-Devel-PatchPerl"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-File--pushd \
perl-Module--Pluggable"

inherit rpm
