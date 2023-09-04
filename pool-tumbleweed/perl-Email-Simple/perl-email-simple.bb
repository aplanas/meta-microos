SUMMARY = "Simple parsing of RFC2822 message format and headers"
DESCRIPTION = "The Email:: namespace was begun as a reaction against the increasing \
complexity and bugginess of Perl's existing email modules. 'Email::*' \
modules are meant to be simple to use and to maintain, pared to the bone, \
fast, minimal in their external dependencies, and correct."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.218"

RPM_NAME = "perl-Email-Simple-2.218-1.3.noarch.rpm"
RPM_HASH = "af984e676793d70d17b8685032d3478efce8b30f0c43f86b81fcc18c608b58778810ad9d65c60fc5e067e10680c96cd0d08505e8559019939e11ae751ff49e02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Simple \
perl-Email--Simple--Creator \
perl-Email--Simple--Header \
perl-Email-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Email--Date--Format"

inherit rpm
