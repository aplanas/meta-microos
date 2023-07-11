SUMMARY = "Checks to see if the module can be loaded"
DESCRIPTION = "Test::Requires checks to see if the module can be loaded. \
 \
If this fails rather than failing tests this *skips all tests*. \
 \
Test::Requires can also be used to require a minimum version of Perl: \
 \
    use Test::Requires '5.010';  # quoting is necessary!! \
 \
     \
    use Test::Requires 'v5.10';"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-Test-Requires-0.11-1.14.noarch.rpm"
RPM_HASH = "1dee3ab30de8bc3a78d5ad331c71b70435712141302db70acd163d2371b305e84959b6ae25c115d47a7c97e72cca813489d35f5c8dc22171a7b96da7c4425884"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Requires \
perl-Test-Requires"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
