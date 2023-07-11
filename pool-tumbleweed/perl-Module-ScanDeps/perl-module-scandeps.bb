SUMMARY = "Recursively scan Perl code for dependencies"
DESCRIPTION = "This module scans potential modules used by perl programs, and returns a \
hash reference; its keys are the module names as appears in '%INC' (e.g. \
'Test/More.pm'); the values are hash references with this structure: \
 \
    { \
        file    => '/usr/local/lib/perl5/5.8.0/Test/More.pm', \
        key     => 'Test/More.pm', \
        type    => 'module',    # or 'autoload', 'data', 'shared' \
        used_by => [ 'Test/Simple.pm', ... ], \
        uses    => [ 'Test/Other.pm', ... ], \
    } \
 \
One function, 'scan_deps', is exported by default. Other functions such as \
('scan_line', 'scan_chunk', 'add_deps', 'path_to_inc_name') are exported \
upon request. \
 \
Users of *App::Packer* may also use this module as the dependency-checking \
frontend, by tweaking their _p2e.pl_ like below: \
 \
    use Module::ScanDeps; \
    ... \
    my $packer = App::Packer->new( frontend => 'Module::ScanDeps' ); \
    ... \
 \
Please see App::Packer::Frontend for detailed explanation on the structure \
returned by 'get_files'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.31"

RPM_NAME = "perl-Module-ScanDeps-1.31-1.10.aarch64.rpm"
RPM_HASH = "0450e5aee41954b532c1e4e2b53c3aaeb0f16c8723bfec138db1993134134b2753a019f188de9fe7e4ae6342413083a1957e1de1e1cc0f553f64e6d088e04d53"

RPROVIDES:${PN} += "perl-Module--ScanDeps \
perl-Module--ScanDeps--Cache \
perl-Module-ScanDeps"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Module--Metadata \
perl-version"

inherit rpm
