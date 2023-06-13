SUMMARY = "Generic Config Module"
DESCRIPTION = "This module opens a config file and parses its contents for you. The *new* \
method requires one parameter which needs to be a filename. The method \
*getall* returns a hash which contains all options and its associated \
values of your config file. \
 \
The format of config files supported by *Config::General* is inspired by \
the well known Apache config format, in fact, this module is 100% \
compatible to Apache configs, but you can also just use simple name/value \
pairs in your config files. \
 \
In addition to the capabilities of an Apache config file it supports some \
enhancements such as here-documents, C-style comments or multiline options."
LICENSE = "Artistic-2.0"

PV = "2.65"

RPM_NAME = "perl-Config-General-2.65-1.6.aarch64.rpm"
RPM_HASH = "7ec403d3b83264313fbb8bc24c4fec73b4b1492bf5db755b5b548292f4e49af01cef3636715f679da784167f90199da88ae73feb6802969aca5905d97ed7869e"

RPROVIDES:${PN} += "perl(Config::General) \
perl(Config::General::Extended) \
perl(Config::General::Interpolated) \
perl-Config-General \
perl-Config-General(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
