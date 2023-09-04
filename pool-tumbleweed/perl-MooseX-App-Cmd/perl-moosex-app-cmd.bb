SUMMARY = "Mashes up MooseX::Getopt and App::Cmd"
DESCRIPTION = "This module marries App::Cmd with MooseX::Getopt. \
 \
Use it like App::Cmd advises (especially see App::Cmd::Tutorial), swapping \
App::Cmd::Command for MooseX::App::Cmd::Command. \
 \
Then you can write your moose commands as Moose classes, with \
MooseX::Getopt defining the options for you instead of 'opt_spec' returning \
a Getopt::Long::Descriptive spec."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.34"

RPM_NAME = "perl-MooseX-App-Cmd-0.34-1.12.noarch.rpm"
RPM_HASH = "4e8dab4dc22dff191d4e0cdbcc43ad568b7004b83f16cf39e76e7b5d2b788ebfc7ac0a425f5198ed7883d2985ef1d389a28ffd215bd2da609ebcd10fd4819a77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--App--Cmd \
perl-MooseX--App--Cmd--Command \
perl-MooseX-App-Cmd"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-App--Cmd \
perl-App--Cmd--Command \
perl-Getopt--Long--Descriptive \
perl-Moose \
perl-Moose--Object \
perl-MooseX--Getopt \
perl-MooseX--NonMoose \
perl-namespace--autoclean"

inherit rpm
