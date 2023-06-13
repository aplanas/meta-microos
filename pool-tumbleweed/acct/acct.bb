SUMMARY = "User-Specific Process Accounting"
DESCRIPTION = "This package contains the programs necessary for user-specific process \
accounting: sa, accton, and lastcomm."
LICENSE = "GPL-2.0-or-later"

PV = "6.6.4"

RPM_NAME = "acct-6.6.4-4.7.aarch64.rpm"
RPM_HASH = "56f90fb78d8ad4fea2ddfbf54b0b12a24815119d1914c96c37b9d5afa3f738029f336f9bdd15ccc3134a5e16be64c9a1cb35210779bb96084b48615caaa6bc75"

RPROVIDES:${PN} += "acct \
acct(aarch-64) \
config(acct)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
logrotate"

inherit rpm
