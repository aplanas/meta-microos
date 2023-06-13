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

RPM_NAME = "perl-MooseX-App-Cmd-0.34-1.10.noarch.rpm"
RPM_HASH = "fb8a54ded95dca0435be0aae989329fdbe79b9e8dc51ce22c30f758d38265f5c6c8c793d64063e8c4d87c35a762ff7b7d5e3f4a421040774ef1d5baaaf672eab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::App::Cmd) \
perl(MooseX::App::Cmd::Command) \
perl-MooseX-App-Cmd"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(App::Cmd) \
perl(App::Cmd::Command) \
perl(Getopt::Long::Descriptive) \
perl(Moose) \
perl(Moose::Object) \
perl(MooseX::Getopt) \
perl(MooseX::NonMoose) \
perl(namespace::autoclean)"

inherit rpm
