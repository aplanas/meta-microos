SUMMARY = "Utilities to test STDOUT and STDERR messages"
DESCRIPTION = "Test::Output provides a simple interface for testing output sent to \
'STDOUT' or 'STDERR'. A number of different utilities are included to try \
and be as flexible as possible to the tester. \
 \
Likewise, Capture::Tiny provides a much more robust capture mechanism \
without than the original Test::Output::Tie."
LICENSE = "Artistic-2.0"

PV = "1.034"

RPM_NAME = "perl-Test-Output-1.034-1.2.noarch.rpm"
RPM_HASH = "3edefb098334a4ed76a9c1eb05b15ed689954ba2aa51bcad776df380ae605e07a61d8e15b7789be3eb66383c960f0e9824c3de429c2aff3be322388c6b8c4241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Output \
perl-Test-Output"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Capture--Tiny \
perl-File--Temp"

inherit rpm
