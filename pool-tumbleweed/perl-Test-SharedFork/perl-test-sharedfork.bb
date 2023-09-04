SUMMARY = "Fork Test"
DESCRIPTION = "Test::SharedFork is utility module for Test::Builder. \
 \
This module makes fork(2) safety in your test case. \
 \
This module merges test count with parent process & child process."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.35"

RPM_NAME = "perl-Test-SharedFork-0.35-1.27.noarch.rpm"
RPM_HASH = "888b82f040af7160f93d83a54cc7886ab1b16f106ccee98230a6066bb3a71447800ca726419f8baeae614121a4442f2056a42faf51781d441417538ec84657d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--SharedFork \
perl-Test--SharedFork--Array \
perl-Test--SharedFork--Scalar \
perl-Test--SharedFork--Store \
perl-Test-SharedFork"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--More"

inherit rpm
