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

RPM_NAME = "perl-Path-FindDev-0.5.3-1.23.noarch.rpm"
RPM_HASH = "39461fed00972b957e9cd9c8d0abca347d4d432937b821b698aadf1213fd16eedf930a7b4d66c984afcbf3956be875866da83728731487f562bb7170fbb43449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Path--FindDev \
perl-Path--FindDev--Object \
perl-Path-FindDev"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Tiny \
perl-Path--IsDev \
perl-Path--IsDev--Object \
perl-Path--Tiny \
perl-Sub--Exporter"

inherit rpm
