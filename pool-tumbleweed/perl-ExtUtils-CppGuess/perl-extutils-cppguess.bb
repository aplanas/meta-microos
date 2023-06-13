SUMMARY = "Guess C++ compiler and flags"
DESCRIPTION = "'ExtUtils::CppGuess' attempts to guess the system's C++ compiler that is \
compatible with the C compiler that your perl was built with. \
 \
It can generate the necessary options to the Module::Build constructor or \
to ExtUtils::MakeMaker's 'WriteMakefile' function."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.26"

RPM_NAME = "perl-ExtUtils-CppGuess-0.26-1.6.aarch64.rpm"
RPM_HASH = "e6727379a63062bb6ef989a7549e0bd147e912f2d2c82b5b7860433427b4f2da05152a662317af9de5fb32c5083c64398e61f6deffa17639ba150abeca2ceead"

RPROVIDES:${PN} += "perl(ExtUtils::CppGuess) \
perl-ExtUtils-CppGuess \
perl-ExtUtils-CppGuess(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Capture::Tiny) \
perl(ExtUtils::ParseXS)"

inherit rpm
