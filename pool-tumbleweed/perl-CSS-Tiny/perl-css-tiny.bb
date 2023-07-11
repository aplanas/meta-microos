SUMMARY = "Read/Write .css files with as little code as possible"
DESCRIPTION = "'CSS::Tiny' is a perl class to read and write .css stylesheets with as \
little code as possible, reducing load time and memory overhead. CSS.pm \
requires about 2.6 meg or ram to load, which is a large amount of overhead \
if you only want to do trivial things. Memory usage is normally scoffed at \
in Perl, but in my opinion should be at least kept in mind. \
 \
This module is primarily for reading and writing simple files, and anything \
we write shouldn't need to have documentation/comments. If you need \
something with more power, move up to CSS.pm. With the increasing \
complexity of CSS, this is becoming more common, but many situations can \
still live with simple CSS files."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.20"

RPM_NAME = "perl-CSS-Tiny-1.20-1.25.noarch.rpm"
RPM_HASH = "ea39466ea470382346124123313d9f14763db94b5feeec9fa9c5a165348229f52d325033aeb3f196b4c7a668873a907918415e38c9bd5a5364fee6794a1afa2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CSS--Tiny \
perl-CSS-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
