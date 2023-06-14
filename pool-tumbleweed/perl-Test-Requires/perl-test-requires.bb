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

RPM_NAME = "perl-Test-Requires-0.11-1.13.noarch.rpm"
RPM_HASH = "e3b995e3e7d004aed3b86c89a7c1b1c6ad608e116329f46b826c692f9367bc3f0ec9aa8bf24e806fa28e93cda08bc4fb5cdbc15fb13a3f873b2af38bdb75deba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Requires \
perl-Test-Requires"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
