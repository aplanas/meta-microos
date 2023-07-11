SUMMARY = "Build custom test packages with only the features you want"
DESCRIPTION = "Test::Kit allows you to create a single module in your project which gives \
you access to all of the testing functions you want. \
 \
Its primary goal is to reduce boilerplate code that is currently littering \
the top of all your test files. \
 \
It also allows your testing to be more consistent; for example it becomes a \
trivial change to include Test::FailWarnings in all of your tests, and \
there is no danger that you forget to include it in a new test."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.15"

RPM_NAME = "perl-Test-Kit-2.15-1.16.noarch.rpm"
RPM_HASH = "a5c6cc64e62d0392ed260389cd860d893e79f0659267d7778f5c88d3a8a6b30678d3ac1f75be089e196a258f2ae08d8a4a2a9b6d258c1e24ae0c83cec92a0a77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Kit \
perl-Test-Kit"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Hook--LexWrap \
perl-Import--Into \
perl-Module--Runtime \
perl-Sub--Delete"

inherit rpm
