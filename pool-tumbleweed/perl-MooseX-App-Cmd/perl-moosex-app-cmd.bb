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

RPM_NAME = "perl-MooseX-App-Cmd-0.34-1.11.noarch.rpm"
RPM_HASH = "3c727c39c953064226be321db3be77cd51aca79038fa801b524661a08a9b993537bee9365c0561bf8ac868aa6b0c2b11580444c44a1d66ec3d172133ae0fccfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--App--Cmd \
perl-MooseX--App--Cmd--Command \
perl-MooseX-App-Cmd"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-App--Cmd \
perl-App--Cmd--Command \
perl-Getopt--Long--Descriptive \
perl-Moose \
perl-Moose--Object \
perl-MooseX--Getopt \
perl-MooseX--NonMoose \
perl-namespace--autoclean"

inherit rpm
