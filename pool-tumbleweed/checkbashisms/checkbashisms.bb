SUMMARY = "Tool for checking /bin/sh scripts for possible bashisms"
DESCRIPTION = "checkbashisms performs basic checks on /bin/sh shell scripts for \
the possible presence of bashisms. It takes the names of the shell \
scripts on the command line, and outputs warnings if possible \
bashisms are detected."
LICENSE = "GPL-2.0-or-later"

PV = "2.22.2"

RPM_NAME = "checkbashisms-2.22.2-1.5.noarch.rpm"
RPM_HASH = "cd15d59f1b44f05e1bca5f9a89b824c5062bf31414b3a57f014d055da78eebf9dd5178375afbdebbd9fbf16c40b370c0088768fcfcb87e253f9508a52b890bda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "checkbashisms \
deb-/usr/bin/checkbashisms \
devscripts-/usr/bin/checkbashisms"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
