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

RPM_NAME = "perl-Path-FindDev-0.5.3-1.22.noarch.rpm"
RPM_HASH = "599f055e26638f4372d73b06c8024a122696a611fa7a2f35b6651d3a01d477bdebbd84f712eae2b0ad9cdf1c36d9495b80d8330d117bbf37c0f7b801909e8d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Path::FindDev) \
perl(Path::FindDev::Object) \
perl-Path-FindDev"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Tiny) \
perl(Path::IsDev) \
perl(Path::IsDev::Object) \
perl(Path::Tiny) \
perl(Sub::Exporter)"

inherit rpm
