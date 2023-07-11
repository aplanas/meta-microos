SUMMARY = "Fork Test"
DESCRIPTION = "Test::SharedFork is utility module for Test::Builder. \
 \
This module makes fork(2) safety in your test case. \
 \
This module merges test count with parent process & child process."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.35"

RPM_NAME = "perl-Test-SharedFork-0.35-1.26.noarch.rpm"
RPM_HASH = "61bb10e9877477254c81896a30979091d569d4197804916246c0174d29c0e160ecdc727e01dfd9dc99cc37c10191250acbf9d301edb41ffefe1106412db76124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--SharedFork \
perl-Test--SharedFork--Array \
perl-Test--SharedFork--Scalar \
perl-Test--SharedFork--Store \
perl-Test-SharedFork"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test--More"

inherit rpm
