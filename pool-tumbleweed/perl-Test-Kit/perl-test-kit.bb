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

PV = "2.160.0"

RPM_NAME = "perl-Test-Kit-2.160.0-1.1.noarch.rpm"
RPM_HASH = "74e9e7a15d7d7e734120761fccc5190a6d30e29b8742655c4a6b4dc95c10b778523234282755226f6624197e8e648f9474ee845ffe688b7ef01a5d4104220899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Kit \
perl-Test-Kit"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Hook--LexWrap \
perl-Import--Into \
perl-Module--Runtime \
perl-Sub--Delete"

inherit rpm
