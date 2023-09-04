SUMMARY = "Find a development path somewhere in an upper hierarchy"
DESCRIPTION = "This package is mostly a glue layer around 'Path::IsDev' with a few \
directory walking tricks. \
 \
    use Path::FindDev qw( find_dev ); \
 \
    if ( my $root = find_dev('/some/path/to/something/somewhere')) { \
        print 'development root = $root'; \
    } else { \
        print 'No development root :('; \
    }"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.5.3"

RPM_NAME = "perl-Path-FindDev-0.5.3-1.24.noarch.rpm"
RPM_HASH = "37167c1a27a7738a0d09da9dd980cc450bbf7155dc395463a64c2af1cd8ab02229f93dceca1e994a45de46bc4b535e572aa8ff2d392c829cd723afbc20db3cc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Path--FindDev \
perl-Path--FindDev--Object \
perl-Path-FindDev"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Tiny \
perl-Path--IsDev \
perl-Path--IsDev--Object \
perl-Path--Tiny \
perl-Sub--Exporter"

inherit rpm
