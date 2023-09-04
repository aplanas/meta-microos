SUMMARY = "ChaSen Perl Module"
DESCRIPTION = "ChaSen Perl Module"
LICENSE = "BSD-3-Clause"

PV = "2.4.5"

RPM_NAME = "perl-Text-ChaSen-2.4.5-2.13.aarch64.rpm"
RPM_HASH = "764515039bb565250f11a1cbb7d745e3be1e7817a7ace48d5a7db2ae16edef3346fc3e6f9e876bd953692778cbc66ab2f5db3f9b5464ce3a6f316fe9bef7996d"

RPROVIDES:${PN} += "chasen-perl \
perl-Text--ChaSen \
perl-Text-ChaSen"

RDEPENDS:${PN} += "chasen \
libc.so.6 \
perl"

inherit rpm
