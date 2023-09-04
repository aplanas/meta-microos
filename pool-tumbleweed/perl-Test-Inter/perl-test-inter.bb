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

RPM_NAME = "perl-Test-Inter-1.10-1.3.noarch.rpm"
RPM_HASH = "5f8efb544d323d97158be8fce53deb7fc1bf305f4f1938441627b8023ef0a2198b9fdddbdc00aca0aee7f1369b8cc18250fe7527ceb58a4e4ea2ae3305623c7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Inter \
perl-Test-Inter"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
