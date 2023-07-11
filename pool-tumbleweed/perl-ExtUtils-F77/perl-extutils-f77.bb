SUMMARY = "Simple interface to F77 libs"
DESCRIPTION = "This module tries to figure out how to link C programs with Fortran \
subroutines on your system. Basically one must add a list of Fortran \
runtime libraries. The problem is their location and name varies with each \
OS/compiler combination! It was originally developed to make building and \
installation of the PGPLOT module easier, which links to the pgplot Fortran \
graphics library. It is now used by a number of perl modules. \
 \
This module tries to implement a simple 'rule-of-thumb' database for \
various flavours of UNIX systems. A simple self-documenting Perl database \
of knowledge/code for figuring out how to link for various combinations of \
OS and compiler is embedded in the modules Perl code. Please help save the \
world by submitted patches for new database entries for your system at \
https://github.com/PDLPorters/extutils-f77 \
 \
Note the default on most systems is now to search for a generic 'GNU' \
compiler which can be gfortran, g77, g95 or fort77 (in that order based on \
usage) and then find the appropriate link libraries automatically. (This is \
the 'Generic' 'GNU' database entry in the code.) \
 \
The target compiler can be explicitly overriden by setting the environment \
variable F77, e.g. \
 \
 % setenv F77 'x86_64-pc-linux-gnu-gfortran' \
 % perl -MExtUtils::F77 -e 'print ExtUtils::F77->compiler, '\\n'' \
 \
The library list which the module returns can be explicitly overridden by \
setting the environment variable F77LIBS, e.g. \
 \
  % setenv F77LIBS '-lfoo -lbar' \
  % perl -MExtUtils::F77 -e 'print ExtUtils::F77->runtime, '\\n'' \
  ..."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.26"

RPM_NAME = "perl-ExtUtils-F77-1.26-1.11.noarch.rpm"
RPM_HASH = "d3c3d5c6dca3a76ef3524a4a530ba0faffca77c0f45933819e43e849a57aa4d9502ac2870accb273fbf01d1394a94014ea4dacc3f15b57e55f0868d0ef2e268d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--F77 \
perl-ExtUtils-F77"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--Which"

inherit rpm
