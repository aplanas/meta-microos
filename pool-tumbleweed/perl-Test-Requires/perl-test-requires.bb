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

RPM_NAME = "perl-Test-Requires-0.11-1.15.noarch.rpm"
RPM_HASH = "44f216e843fd469c8a71293c500720461a78b0ea97831d80a798851ef3373389467a4e2f3c7ed2100cf968ad1877e2bca92ee67edef72b8b156b16f72780850b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Requires \
perl-Test-Requires"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
