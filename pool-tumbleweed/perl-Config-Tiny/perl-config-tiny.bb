SUMMARY = "Read/Write .ini style files with as little code as possible"
DESCRIPTION = "'Config::Tiny' is a Perl class to read and write .ini style configuration \
files with as little code as possible, reducing load time and memory \
overhead. \
 \
Most of the time it is accepted that Perl applications use a lot of memory \
and modules. \
 \
The '*::Tiny' family of modules is specifically intended to provide an \
ultralight alternative to the standard modules. \
 \
This module is primarily for reading human written files, and anything we \
write shouldn't need to have documentation/comments. If you need something \
with more power move up to Config::Simple, Config::General or one of the \
many other 'Config::*' modules. \
 \
Lastly, Config::Tiny does *not* preserve your comments, whitespace, or the \
order of your config file. \
 \
See Config::Tiny::Ordered (and possibly others) for the preservation of the \
order of the entries in the file."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.29"

RPM_NAME = "perl-Config-Tiny-2.29-1.1.noarch.rpm"
RPM_HASH = "86d4c27ab10ed3d2e891e714b15a1a2297eadc1ddeac3b217a1fac08c3a98dbc0c7894bd3a27c89eafdbc0643effeac20c15c4c977350f163def00edbe7be883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--Tiny \
perl-Config-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-File--Spec \
perl-File--Temp"

inherit rpm
