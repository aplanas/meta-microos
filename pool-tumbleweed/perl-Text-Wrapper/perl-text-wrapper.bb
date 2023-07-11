SUMMARY = "Word wrap text by breaking long lines"
DESCRIPTION = "Text::Wrapper provides simple word wrapping. It breaks long lines, but does \
not alter spacing or remove existing line breaks. If you're looking for \
more sophisticated text formatting, try the the Text::Format manpage \
module. \
 \
Reasons to use Text::Wrapper instead of Text::Format: \
 \
* * \
 \
  Text::Wrapper is significantly smaller. \
 \
* * \
 \
  It does not alter existing whitespace or combine short lines. It only \
  breaks long lines. \
 \
Again, if Text::Wrapper doesn't meet your needs, try Text::Format."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.05"

RPM_NAME = "perl-Text-Wrapper-1.05-3.27.noarch.rpm"
RPM_HASH = "349aee8e29af936dfd38ab92f7dba96052f932f3309b6f7d99d7cf79583f0bea477dbab5598c3d2b052698adb809b4edba39648bfe74cb495a7728e3954d0dbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Wrapper \
perl-Text-Wrapper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
