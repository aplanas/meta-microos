SUMMARY = "A simple object base class."
DESCRIPTION = "the Rose::Object manpage is a generic object base class. It provides very \
little functionality, but a healthy dose of convention."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.860"

RPM_NAME = "perl-Rose-Object-0.860-1.28.noarch.rpm"
RPM_HASH = "b885097285f9fb3b1d945144cce53d49a259c713bb5afb7a6ed477398810ee5e4cba0fe3c3295978081122dc4541f43fda7ddbdb4f6cf7baa4411b738ef72089"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
