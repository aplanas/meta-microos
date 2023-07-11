SUMMARY = "A simple object base class."
DESCRIPTION = "the Rose::Object manpage is a generic object base class. It provides very \
little functionality, but a healthy dose of convention."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.860"

RPM_NAME = "perl-Rose-Object-0.860-1.27.noarch.rpm"
RPM_HASH = "53ecaaf83745c47296618332f52052bd8f8bceaca7602ba6f1f32ee53eb7185615b49f8a617396d1ecdc12509adbe22e28d61f96bfb308a1d2bda36b66e09ffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Rose--Class \
perl-Rose--Class--MakeMethods--Generic \
perl-Rose--Class--MakeMethods--Set \
perl-Rose--Object \
perl-Rose--Object--MakeMethods \
perl-Rose--Object--MakeMethods--DateTime \
perl-Rose--Object--MakeMethods--Generic \
perl-Rose--Object--MixIn \
perl-Rose-Object"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
