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

RPM_NAME = "perl-Text-Template-1.61-1.7.noarch.rpm"
RPM_HASH = "5c11401e3739942a7530a76856f941abe9186dfebfe8bb716b820cd62ee796f269eba9b2af1c85ebad8c6370faae4b451759266ae210b0c81633c7924a0e77a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Template \
perl-Text--Template--Preprocess \
perl-Text-Template"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
