SUMMARY = "Maildir and IMAP processor/filter using Python 3x as its configuration language"
DESCRIPTION = "The maildirproc and imapproc utilities provided by this package filter emails \
in maildirs and IMAP folders with a user provided filter script written in \
Python."
LICENSE = "GPL-2.0-only"

PV = "1.2.7"

RPM_NAME = "mailprocessing-1.2.7-1.11.noarch.rpm"
RPM_HASH = "96eb3068d88059dd39c8125b3fef272bf4a557472df67a9254bb8cf128e258e7874e5f3f4e44cf384c0fce2bb6d97ed5b88ff45448a6825d1518f90e7558524b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maildirproc \
mailprocessing \
python3.11dist-mailprocessing \
python3dist-mailprocessing"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3"

inherit rpm
