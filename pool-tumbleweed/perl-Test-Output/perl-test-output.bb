SUMMARY = "Utilities to test STDOUT and STDERR messages"
DESCRIPTION = "Test::Output provides a simple interface for testing output sent to \
'STDOUT' or 'STDERR'. A number of different utilities are included to try \
and be as flexible as possible to the tester. \
 \
Likewise, Capture::Tiny provides a much more robust capture mechanism \
without than the original Test::Output::Tie."
LICENSE = "Artistic-2.0"

PV = "1.033"

RPM_NAME = "perl-Test-Output-1.033-1.10.noarch.rpm"
RPM_HASH = "99a604f6179551640153e15d497b5fae71b8968a7aee9e2e03d7388126fc6d9419feb84a6faaa502109a7e66e6d526b69bee2f62557871df4a02d61457b24b50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Output) \
perl-Test-Output"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Capture::Tiny) \
perl(File::Temp)"

inherit rpm
