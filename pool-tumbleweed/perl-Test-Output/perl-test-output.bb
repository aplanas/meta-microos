SUMMARY = "Utilities to test STDOUT and STDERR messages"
DESCRIPTION = "Test::Output provides a simple interface for testing output sent to \
'STDOUT' or 'STDERR'. A number of different utilities are included to try \
and be as flexible as possible to the tester. \
 \
Likewise, Capture::Tiny provides a much more robust capture mechanism \
without than the original Test::Output::Tie."
LICENSE = "Artistic-2.0"

PV = "1.033"

RPM_NAME = "perl-Test-Output-1.033-1.11.noarch.rpm"
RPM_HASH = "de0642314178ababf43b062f385d8f29eb62f74fa1fc5b83fb5c4e5b212dd84317460cef5558aa6851430940eefb9fe5d7567c06d9fe3e0764530d18e3063dab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Output \
perl-Test-Output"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Capture--Tiny \
perl-File--Temp"

inherit rpm
