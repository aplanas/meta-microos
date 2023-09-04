SUMMARY = "Simple configuration file class"
DESCRIPTION = "Reading and writing configuration files is one of the most frequent tasks of \
any software design. Config::Simple is the library that helps you with it. \
 \
Config::Simple is a class representing configuration file object. It supports \
several configuration file syntax and tries to identify the file syntax \
automatically. Library supports parsing, updating and creating configuration \
files."
LICENSE = "Artistic-1.0"

PV = "4.59"

RPM_NAME = "perl-Config-Simple-4.59-19.31.aarch64.rpm"
RPM_HASH = "d0c2c83305975744c0bdded471a491e093c0825a5f6b0b198a36958f258d2ecf82e128506df8c098a005749ee24aa7024e88f51a3acecc718d2cb885598a82ce"

RPROVIDES:${PN} += "perl-Config--Simple \
perl-Config-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-AutoLoader"

inherit rpm
