SUMMARY = "Write tests in a declarative specification style"
DESCRIPTION = "This is a declarative specification-style testing system for \
behavior-driven development (BDD) in Perl. The tests (a.k.a. examples) are \
named with strings instead of subroutine names, so your fingers will suffer \
less fatigue from underscore-itis, with the side benefit that the test \
reports are more legible. \
 \
This module is inspired by and borrows heavily from at \
http://rspec.info/documentation, a BDD tool for the Ruby programming \
language."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.54"

RPM_NAME = "perl-Test-Spec-0.54-1.17.noarch.rpm"
RPM_HASH = "b31b419f26dcb22d58d19bdf72b5b4331daa00401400a47d8e68cb2ddcb628263b88e47a34022c878d22f1eaf2ec20460bf66fbf5f5694d08494d3f12c120f1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Spec \
perl-Test--Spec--Context \
perl-Test--Spec--Example \
perl-Test--Spec--ExportProxy \
perl-Test--Spec--Mocks \
perl-Test--Spec--Mocks--Expectation \
perl-Test--Spec--Mocks--MockObject \
perl-Test--Spec--Mocks--Stub \
perl-Test--Spec--SharedHash \
perl-Test--Spec--TodoExample \
perl-Test-Spec"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Devel--GlobalPhase \
perl-Package--Stash \
perl-TAP--Parser \
perl-Test--Deep \
perl-Test--More \
perl-Test--Trap \
perl-Tie--IxHash"

inherit rpm
