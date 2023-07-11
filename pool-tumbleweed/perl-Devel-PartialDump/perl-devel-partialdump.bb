SUMMARY = "Partial dumping of data structures, optimized for argument printing"
DESCRIPTION = "This module is a data dumper optimized for logging of arbitrary parameters. \
 \
It attempts to truncate overly verbose data, in a way that is hopefully \
more useful for diagnostics warnings than \
 \
    warn Dumper(@stuff); \
 \
Unlike other data dumping modules there are no attempts at correctness or \
cross referencing, this is only meant to provide a slightly deeper look \
into the data in question. \
 \
There is a default recursion limit, and a default truncation of long lists, \
and the dump is formatted on one line (new lines in strings are escaped), \
to aid in readability. \
 \
You can enable it temporarily by importing functions like 'warn', 'croak' \
etc to get more informative errors during development, or even use it as: \
 \
    BEGIN { local $@; eval 'use Devel::PartialDump qw(...)' } \
 \
to get DWIM formatting only if it's installed, without introducing a \
dependency."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.20"

RPM_NAME = "perl-Devel-PartialDump-0.20-1.21.noarch.rpm"
RPM_HASH = "c04704b6ce801d65a07dab8c87043ef0c3739940c9bf1cc4f863bb36cf4acb5992d4eca7a3effd11f82d88488bd413a33cc6455ff0b34234e7990d4518585cca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DB \
perl-Devel--PartialDump \
perl-Devel-PartialDump"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Tiny \
perl-Sub--Exporter \
perl-namespace--clean"

inherit rpm
