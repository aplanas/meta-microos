SUMMARY = "Parse and manipulate Perl version strings"
DESCRIPTION = "Perl::Version provides a simple interface for parsing, manipulating and \
formatting Perl version strings. \
 \
Unlike version.pm (which concentrates on parsing and comparing version \
strings) Perl::Version is designed for cases where you'd like to parse a \
version, modify it and get back the modified version formatted like the \
original. \
 \
For example: \
 \
    my $version = Perl::Version->new( '1.2.3' ); \
    $version->inc_version; \
    print '$version\\n'; \
 \
prints \
 \
    1.3.0 \
 \
whereas \
 \
    my $version = Perl::Version->new( 'v1.02.03' ); \
    $version->inc_version; \
    print '$version\\n'; \
 \
prints \
 \
    v1.03.00 \
 \
Both are representations of the same version and they'd compare equal but \
their formatting is different. \
 \
Perl::Version tries hard to guess and recreate the format of the original \
version and in most cases it succeeds. In rare cases the formatting is \
ambiguous. Consider \
 \
    1.10.03 \
 \
Do you suppose that second component '10' is zero padded like the third \
component? Perl::Version will assume that it is: \
 \
    my $version = Perl::Version->new( '1.10.03' ); \
    $version->inc_revision; \
    print '$version\\n'; \
 \
will print \
 \
    2.00.00 \
 \
If all of the components after the first are the same length (two \
characters in this case) and any of them begins with a zero Perl::Version \
will assume that they're all zero padded to the same length. \
 \
The first component and any alpha suffix are handled separately. In each \
case if either of them starts with a zero they will be zero padded to the \
same length when stringifying the version."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.013"

RPM_NAME = "perl-Perl-Version-1.013-3.28.noarch.rpm"
RPM_HASH = "89fea2f8e08b4c8ec31cb7a4cdbe2147f6bab917c9111f081fe7a24b53621cb637d17acffdc2bfd9bad2b19c811c87ac473161a646ac4e8d03f051600ff42e9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Perl--Version \
perl-Perl-Version"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-File--Slurp--Tiny"

inherit rpm
