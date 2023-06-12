SUMMARY = "Clock widget with analog and digital display"
DESCRIPTION = "This module implements a Canvas-based clock widget for perl-Tk with lots of \
options to change the appearance. \
 \
Both analog and digital clocks are implemented."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.44"

RPM_NAME = "perl-Tk-Clock-0.44-1.1.noarch.rpm"
RPM_HASH = "3aec4df5aa594c14f1ba9d2c3a031ceb9e1bce851aeddf5b627a91166389e793a8375d9aa2c0d8e53dec153435eee64f7f23e777b9c948639a72a26893102714"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Tk::Clock) \
perl-Tk-Clock"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Test::More) \
perl(Test::NoWarnings) \
perl(Tk) \
perl(Tk::Canvas) \
perl(Tk::Derived) \
perl(Tk::Widget)"

inherit rpm
