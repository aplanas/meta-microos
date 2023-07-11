SUMMARY = "Guess C++ compiler and flags"
DESCRIPTION = "'ExtUtils::CppGuess' attempts to guess the system's C++ compiler that is \
compatible with the C compiler that your perl was built with. \
 \
It can generate the necessary options to the Module::Build constructor or \
to ExtUtils::MakeMaker's 'WriteMakefile' function."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.26"

RPM_NAME = "perl-ExtUtils-CppGuess-0.26-1.7.aarch64.rpm"
RPM_HASH = "9aea80b2f35423675e5fd0651c6096cfd0bf239fedbaa8c1980f941147cac961ba9b31d3ebb294761615c566dc14809f9e9a57ed63698bcaf9fa38a0d247e57b"

RPROVIDES:${PN} += "perl-ExtUtils--CppGuess \
perl-ExtUtils-CppGuess"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Capture--Tiny \
perl-ExtUtils--ParseXS"

inherit rpm
