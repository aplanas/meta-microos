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

RPM_NAME = "perl-Config-General-2.65-1.8.aarch64.rpm"
RPM_HASH = "4ac50d8c55cdcd9dccf2e04aeab678680ba342b1a886e48f9f0490205cf71351237d5c46ad6d77c8694a1c4b81205378a1ce8c27773bffbff91891353eeafd4e"

RPROVIDES:${PN} += "perl-Config--General \
perl-Config--General--Extended \
perl-Config--General--Interpolated \
perl-Config-General"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
