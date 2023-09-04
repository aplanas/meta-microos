SUMMARY = "Moose role for processing command line options"
DESCRIPTION = "This is a role which provides an alternate constructor for creating objects \
using parameters passed in from the command line."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.75"

RPM_NAME = "perl-MooseX-Getopt-0.75-1.12.noarch.rpm"
RPM_HASH = "5a4461631c80a7a2a5b30e22574443ea29bb5e7e286a3753d28a63c5c3edf9dceb5d8cbcab6dfec7eb328a9dfa697a3afeeec39f524c6905064a869678d07074"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
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
