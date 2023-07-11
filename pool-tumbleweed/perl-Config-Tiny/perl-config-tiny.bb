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

RPM_NAME = "perl-Config-Tiny-2.29-2.1.noarch.rpm"
RPM_HASH = "1a58461ecfb2a0abba63df0392de2c0a8f2435560ea3fc1a4b8ff466d1e103cd70bde6794e0de54e088d8a7b6328095a7fdffbbbd620e59e0282c38b3720cbed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--Tiny \
perl-Config-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--Spec \
perl-File--Temp"

inherit rpm
