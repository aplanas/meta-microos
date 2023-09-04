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

RPM_NAME = "perl-Test-Kit-2.160.0-1.2.noarch.rpm"
RPM_HASH = "0b161d6564606d492e472ca0ea3c6aa909aae1240b71087a4e0c095b7db4879813c11f85b51a85d681d5d38f7732de8ba71ad2f8eb246f9dd8798dcdfa4d51e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Kit \
perl-Test-Kit"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Hook--LexWrap \
perl-Import--Into \
perl-Module--Runtime \
perl-Sub--Delete"

inherit rpm
