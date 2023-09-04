SUMMARY = "Guess C++ compiler and flags"
DESCRIPTION = "'ExtUtils::CppGuess' attempts to guess the system's C++ compiler that is \
compatible with the C compiler that your perl was built with. \
 \
It can generate the necessary options to the Module::Build constructor or \
to ExtUtils::MakeMaker's 'WriteMakefile' function."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.26"

RPM_NAME = "perl-ExtUtils-CppGuess-0.26-1.8.aarch64.rpm"
RPM_HASH = "8c0d57749432ae99c92f0c4c2287a60e4113d78705c9e7f6cdb87f467fb5663ed3f642ff75d23adfe27883415a275e87b5a92d486cb3ddd42a36f0650fc46801"

RPROVIDES:${PN} += "perl-ExtUtils--CppGuess \
perl-ExtUtils-CppGuess"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Capture--Tiny \
perl-ExtUtils--ParseXS"

inherit rpm
