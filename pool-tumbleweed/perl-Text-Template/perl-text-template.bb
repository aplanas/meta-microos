SUMMARY = "Expand template text with embedded Perl"
DESCRIPTION = "This is a library for generating form letters, building HTML pages, or \
filling in templates generally. A `template' is a piece of text that has \
little Perl programs embedded in it here and there. When you `fill in' a \
template, you evaluate the little programs and replace them with their \
values. \
 \
You can store a template in a file outside your program. People can modify \
the template without modifying the program. You can separate the formatting \
details from the main code, and put the formatting parts of the program \
into the template. That prevents code bloat and encourages functional \
separation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.61"

RPM_NAME = "perl-Text-Template-1.61-1.8.noarch.rpm"
RPM_HASH = "06a814c13e62e866fc462e1336128a9a0783a09f39943698488514478240ba820df4d4714b1dcf6eb0224ac33370f0c65470a76b960755a16ba8b47ac9ea892c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Template \
perl-Text--Template--Preprocess \
perl-Text-Template"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
