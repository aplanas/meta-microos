SUMMARY = "Get number of occupied columns of a string on terminal"
DESCRIPTION = "Get number of occupied columns of a string on terminal \
 \
 \
 \
Authors: \
-------- \
    &#20037;&#20445;&#30000; &#26234;&#24195; (Tomohiro KUBOTA) <kubota@debian.org>"
LICENSE = "Artistic-1.0"

PV = "0.04"

RPM_NAME = "perl-Text-CharWidth-0.04-100.36.aarch64.rpm"
RPM_HASH = "5b8e3a6d4f8222d37e4d48e0a66073d7489dca92fbf56e9636c1d0821405ca14f72062c9dc42f0b04c95269bd5fda8a2989122b68071d05cc9767713ea13eff9"

RPROVIDES:${PN} += "perl-Text--CharWidth \
perl-Text-CharWidth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
