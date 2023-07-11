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

RPM_NAME = "perl-Config-Simple-4.59-19.30.aarch64.rpm"
RPM_HASH = "9c260cf47a14d8685a43e0038bd726f56a86c693d208eeb6aa4283411c9f1ec58001ec113de16d5ca8a1ef64fb3c0d7792e4edef1a289a9bcfecc1893d8fab49"

RPROVIDES:${PN} += "perl-Config--Simple \
perl-Config-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-AutoLoader"

inherit rpm
