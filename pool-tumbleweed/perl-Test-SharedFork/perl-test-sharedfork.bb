SUMMARY = "Fork Test"
DESCRIPTION = "Test::SharedFork is utility module for Test::Builder. \
 \
This module makes fork(2) safety in your test case. \
 \
This module merges test count with parent process & child process."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.35"

RPM_NAME = "perl-Test-SharedFork-0.35-1.25.noarch.rpm"
RPM_HASH = "f7f26bcabe0cd098dd685441a66e760fadc14b0c8b99e9725980711a23ec1266815bb7b126bb8646b70db4e0daf5c848b9ddf657e9760c6a0a2df85d1bab1ba4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--SharedFork \
perl-Test--SharedFork--Array \
perl-Test--SharedFork--Scalar \
perl-Test--SharedFork--Store \
perl-Test-SharedFork"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Test--More"

inherit rpm
