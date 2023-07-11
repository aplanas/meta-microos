SUMMARY = "Automatically apply roles at object creation time"
DESCRIPTION = "Was any of the SYNOPSIS unexpected? Basically, this module is the same \
thing as MooseX::Traits and MouseX::Traits, only for Moo. _Quelle \
surprise_, right?"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.005"

RPM_NAME = "perl-MooX-Traits-0.005-1.13.noarch.rpm"
RPM_HASH = "0d5e5dc0d0694da886a604055da39e972108b4203dcabebf7532f38983ec1870fe29aae2b0c4c874287ef1d536710fd1f20034f1e84d9b1fe213c151a21105b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--Traits \
perl-MooX--Traits--Util \
perl-MooX-Traits"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Exporter--Shiny \
perl-Module--Runtime \
perl-Role--Tiny"

inherit rpm
