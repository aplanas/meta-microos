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

RPM_NAME = "perl-Text-Wrapper-1.05-3.28.noarch.rpm"
RPM_HASH = "fb2cc2c7b974ee551c24c96b6e90f38fdd97be768142679315c8ea9137841071f05e0cde8c6ded49bb0f7f4ef944adcc423142f4b27249cc67f083932e5cf64a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Wrapper \
perl-Text-Wrapper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
