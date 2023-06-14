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

RPM_NAME = "perl-CSS-Tiny-1.20-1.24.noarch.rpm"
RPM_HASH = "bdbc39c854395eb57021c69dde8d5910921cf82a6523fa9c6f287174a0d2d88336a8559e72c0eb3a972b4ea5544ca43309dbfbc3ae3e7c16e1d3d95a5a9423ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CSS--Tiny \
perl-CSS-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
