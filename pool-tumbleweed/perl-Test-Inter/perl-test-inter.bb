SUMMARY = "Framework for more readable interactive test scripts"
DESCRIPTION = "This is another framework for writing test scripts. Much of the syntax is \
loosely inspired by Test::More, and Test::Inter has most of it's \
functionality, but it is not a drop-in replacement. \
 \
Test::More (and other existing test frameworks) suffer from two weaknesses, \
both of which have prevented me from ever using them: \
 \
   None offer the ability to access specific tests in \
   a reasonably interactive fashion, primarily for \
   debugging purposes \
 \
   None offer the ability to write the tests in \
   whatever format would make the tests the most \
   readable \
 \
The way I write and use test scripts, existing Test::* modules are not \
nearly as useful as they could be."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.10"

RPM_NAME = "perl-Test-Inter-1.10-1.1.noarch.rpm"
RPM_HASH = "ac3ea11f97221111c16364bbbe860ae8d8a2a1c51ccc63ef78835ac9fe6455e01d28c7c9be2a1aaf9ee8c1cda23e1ec8b9222fa71d9d73f7cbb289ba090e49e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Inter \
perl-Test-Inter"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
