SUMMARY = "XS++ enhanced flavour of Module::Build"
DESCRIPTION = "This subclass of the Module::Build manpage adds some tools and processes to \
make it easier to use for wrapping C++ using XS++ (the ExtUtils::XSpp \
manpage). \
 \
There are a few minor differences from using 'Module::Build' for an \
ordinary XS module and a few conventions that you should be aware of as an \
XS++ module author. They are documented in the the /'FEATURES AND \
CONVENTIONS' manpage section below. But if you can't be bothered to read \
all that, you may choose skip it and blindly follow the advice in the \
/'JUMP START FOR THE IMPATIENT' manpage. \
 \
An example of a full distribution based on this build tool can be found in \
the the ExtUtils::XSpp manpage distribution under _examples/XSpp-Example_. \
Using that example as the basis for your 'Module::Build::WithXSpp'-based \
distribution is probably a good idea."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.14"

RPM_NAME = "perl-Module-Build-WithXSpp-0.14-3.26.noarch.rpm"
RPM_HASH = "462c18353a5243176debd947436e6ab4c356a636b037ee83b342a5fa167f102a2d37c8481137ea242b9a194e961eefd6da7ab815b2899b6616d83f6a73965d5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Build--WithXSpp \
perl-Module-Build-WithXSpp"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-ExtUtils--CBuilder \
perl-ExtUtils--CppGuess \
perl-ExtUtils--ParseXS \
perl-ExtUtils--Typemaps \
perl-ExtUtils--XSpp \
perl-Module--Build"

inherit rpm
