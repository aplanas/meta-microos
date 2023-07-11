SUMMARY = "Make sure you didn't emit any warnings while testing"
DESCRIPTION = "In general, your tests shouldn't produce warnings. This modules causes any \
warnings to be captured and stored. It automatically adds an extra test \
that will run when your script ends to check that there were no warnings. \
If there were any warnings, the test will give a 'not ok' and diagnostics \
of where, when and what the warning was, including a stack trace of what \
was going on when the it occurred. \
 \
If some of your tests *are supposed to* produce warnings then you should be \
capturing and checking them with Test::Warn, that way Test::NoWarnings will \
not see them and so not complain. \
 \
The test is run by an 'END' block in Test::NoWarnings. It will not be run \
when any forked children exit."
LICENSE = "LGPL-2.1-or-later"

PV = "1.06"

RPM_NAME = "perl-Test-NoWarnings-1.06-1.10.noarch.rpm"
RPM_HASH = "1e7285df77738c4b142aa96af281aebccd59b66582e6b8df6662a38b98cfc957dd976a2c1178602615852ec5322f1de4b7df938b30c47f319f83a0b62640e1ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--NoWarnings \
perl-Test--NoWarnings--Warning \
perl-Test-NoWarnings"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test--Builder"

inherit rpm
