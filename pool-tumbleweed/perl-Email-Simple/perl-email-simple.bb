SUMMARY = "Simple parsing of RFC2822 message format and headers"
DESCRIPTION = "The Email:: namespace was begun as a reaction against the increasing \
complexity and bugginess of Perl's existing email modules. 'Email::*' \
modules are meant to be simple to use and to maintain, pared to the bone, \
fast, minimal in their external dependencies, and correct."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.218"

RPM_NAME = "perl-Email-Simple-2.218-1.2.noarch.rpm"
RPM_HASH = "eba7f313b7ed3f8f3000957a727ee2ef461a1628a59630046269b68788edff9d43e33d795fb5791d05cc7cc76f1a86bfccf8d22ad4c879b124d564f2dc332acb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Simple \
perl-Email--Simple--Creator \
perl-Email--Simple--Header \
perl-Email-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Email--Date--Format"

inherit rpm
