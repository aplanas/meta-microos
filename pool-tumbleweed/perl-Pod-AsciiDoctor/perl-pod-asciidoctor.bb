SUMMARY = "Convert from POD to AsciiDoc"
DESCRIPTION = "Convert from POD to AsciiDoc"
LICENSE = "Apache-2.0"

PV = "0.101003"

RPM_NAME = "perl-Pod-AsciiDoctor-0.101003-1.2.noarch.rpm"
RPM_HASH = "93f0dd3763b8fb51e9c8be04425320a80fbc74e2cb92312d24b08163a1f998b3522a56d928ae30299c272222b08403c19d148f359384f7040011b218535d4a23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--AsciiDoctor \
perl-Pod-AsciiDoctor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Pod--Parser \
perl-parent"

inherit rpm
