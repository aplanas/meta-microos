SUMMARY = "Patch perl source a la Devel::PPPort's buildperl.pl"
DESCRIPTION = "Devel::PatchPerl is a modularisation of the patching code contained in \
Devel::PPPort's 'buildperl.pl'. \
 \
It does not build perls, it merely provides an interface to the source \
patching functionality."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.08"

RPM_NAME = "perl-Devel-PatchPerl-2.08-1.11.aarch64.rpm"
RPM_HASH = "d5edacd27530b0517f00f9f9af266308e58bc0dab4d6e66929fe46c41218f82edc02825d93578f3addb5cb1e999cdbd4805078862b4c6f96e23b9b1222d3ecbb"

RPROVIDES:${PN} += "perl-Devel--PatchPerl \
perl-Devel--PatchPerl--Hints \
perl-Devel--PatchPerl--Plugin \
perl-Devel-PatchPerl"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-File--pushd \
perl-Module--Pluggable"

inherit rpm
