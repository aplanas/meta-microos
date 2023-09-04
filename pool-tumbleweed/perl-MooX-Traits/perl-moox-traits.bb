SUMMARY = "Automatically apply roles at object creation time"
DESCRIPTION = "Was any of the SYNOPSIS unexpected? Basically, this module is the same \
thing as MooseX::Traits and MouseX::Traits, only for Moo. _Quelle \
surprise_, right?"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.005"

RPM_NAME = "perl-MooX-Traits-0.005-1.14.noarch.rpm"
RPM_HASH = "58a5707b76c687b79588208b4ff76e6912918c10e3fb1cfb2611c07be71101b6230621b3a1b9dfd2b55e76e549375f6e6ae3813a26d7e1313a63ec687a3cbbc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--Traits \
perl-MooX--Traits--Util \
perl-MooX-Traits"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Exporter--Shiny \
perl-Module--Runtime \
perl-Role--Tiny"

inherit rpm
