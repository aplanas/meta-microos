SUMMARY = "ChaSen Perl Module"
DESCRIPTION = "ChaSen Perl Module"
LICENSE = "BSD-3-Clause"

PV = "2.4.5"

RPM_NAME = "perl-Text-ChaSen-2.4.5-2.12.aarch64.rpm"
RPM_HASH = "f65a116acbcdc65a0954e3003ac1e33096faf5b52f7a26e9cb476424a11c7b07b800c26b8e5c23187a3694a0a118652fc116ab9b7a02d575d8dce43dab260f59"

RPROVIDES:${PN} += "chasen-perl \
perl-Text--ChaSen \
perl-Text-ChaSen"

RDEPENDS:${PN} += "chasen \
libc.so.6 \
perl"

inherit rpm
