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

RPM_NAME = "perl-Devel-PartialDump-0.20-1.22.noarch.rpm"
RPM_HASH = "837280d46122f6a6c0f4d524c098435e8f3b538b2c8c87e43ccd8bd53d102e501eb4bb7ed6392656cf03448ca934cb141a3bc49795a377e72dc5b56e7b1128a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DB \
perl-Devel--PartialDump \
perl-Devel-PartialDump"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Tiny \
perl-Sub--Exporter \
perl-namespace--clean"

inherit rpm
