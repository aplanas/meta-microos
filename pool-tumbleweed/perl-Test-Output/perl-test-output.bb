SUMMARY = "Utilities to test STDOUT and STDERR messages"
DESCRIPTION = "Test::Output provides a simple interface for testing output sent to \
'STDOUT' or 'STDERR'. A number of different utilities are included to try \
and be as flexible as possible to the tester. \
 \
Likewise, Capture::Tiny provides a much more robust capture mechanism \
without than the original Test::Output::Tie."
LICENSE = "Artistic-2.0"

PV = "1.034"

RPM_NAME = "perl-Test-Output-1.034-1.1.noarch.rpm"
RPM_HASH = "653204472486dceb47657d847386e48eb424e50b60620ee35040a99754b90371a4821ba769ddcd8af9c5baa250dce60e730eafd10d05449d24324132b1599b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Output \
perl-Test-Output"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Capture--Tiny \
perl-File--Temp"

inherit rpm
