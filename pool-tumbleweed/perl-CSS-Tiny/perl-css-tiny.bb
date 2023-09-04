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

RPM_NAME = "perl-CSS-Tiny-1.20-1.26.noarch.rpm"
RPM_HASH = "056a42d09a4e05b336046c3d116f8af3e0dc2713e6d44a5863d4355bd7405e845d5b903a2d4a9afaf675fa83701786cbbdbf7936845b80feb2b0e0d32c0cdba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CSS--Tiny \
perl-CSS-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
