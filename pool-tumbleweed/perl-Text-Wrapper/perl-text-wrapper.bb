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

RPM_NAME = "perl-Text-Wrapper-1.05-3.26.noarch.rpm"
RPM_HASH = "27f87f5d5054f77cfd09934366a0d514339f4a769e9d6ca7b61234c79e0287e20d3f445704a6321f4fce6dab46f8bad8748dcc8c475a79868c10dec0cbedf6d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Wrapper \
perl-Text-Wrapper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
