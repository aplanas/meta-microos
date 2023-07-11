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

RPM_NAME = "perl-Test-Inter-1.10-1.2.noarch.rpm"
RPM_HASH = "ca142b4a9b059992553485f5b4409e7ee3d4bba2a7c433d20371c35fac48713b7ff74dde188c5ce477ad0376d5a6a1477c48b32e512355aed4d52ed96464c828"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Inter \
perl-Test-Inter"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
