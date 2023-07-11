SUMMARY = "Moose role for processing command line options"
DESCRIPTION = "This is a role which provides an alternate constructor for creating objects \
using parameters passed in from the command line."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.75"

RPM_NAME = "perl-MooseX-Getopt-0.75-1.11.noarch.rpm"
RPM_HASH = "2203829da69d844a945c046745a9addd0f13a28bddf35d1c06dc00be898a79e6b2af970bca7b997c835a0b3253dbdc0c0ad0d7390d2f8f6bb5df3d6c81a145aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Getopt \
perl-MooseX--Getopt--Basic \
perl-MooseX--Getopt--Dashes \
perl-MooseX--Getopt--GLD \
perl-MooseX--Getopt--Meta--Attribute \
perl-MooseX--Getopt--Meta--Attribute--NoGetopt \
perl-MooseX--Getopt--Meta--Attribute--Trait \
perl-MooseX--Getopt--Meta--Attribute--Trait--NoGetopt \
perl-MooseX--Getopt--OptionTypeMap \
perl-MooseX--Getopt--ProcessedArgv \
perl-MooseX--Getopt--Strict \
perl-MooseX-Getopt"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Getopt--Long \
perl-Getopt--Long--Descriptive \
perl-Moose \
perl-Moose--Meta--Attribute \
perl-Moose--Role \
perl-Moose--Util--TypeConstraints \
perl-MooseX--Role--Parameterized \
perl-Try--Tiny \
perl-namespace--autoclean"

inherit rpm
