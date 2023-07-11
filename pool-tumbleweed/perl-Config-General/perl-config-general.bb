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

RPM_NAME = "perl-Config-General-2.65-1.7.aarch64.rpm"
RPM_HASH = "9cd5600bacbc6e90f571bb8230b10a20c6f5ef4e30fc67004bd9702e0b757d2c8463138135eeea954f4d6c7f6183be61cb9f6faddfbe1c1a2a31895bdad55c9f"

RPROVIDES:${PN} += "perl-Config--General \
perl-Config--General--Extended \
perl-Config--General--Interpolated \
perl-Config-General"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
