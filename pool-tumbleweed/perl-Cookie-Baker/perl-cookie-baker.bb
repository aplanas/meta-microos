SUMMARY = "Cookie string generator / parser"
DESCRIPTION = "Cookie::Baker provides simple cookie string generator and parser."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-Cookie-Baker-0.11-1.16.noarch.rpm"
RPM_HASH = "fbbaa4a060e84ec2fa0f8e19e6910df7f20c46981ebbcacb47dca2e6fd5528f055d573c51dceddaca3ae54378640aeb6562fd9d8c6c977a1d7697ff274b75a41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Cookie--Baker \
perl-Cookie-Baker"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-URI--Escape"

inherit rpm
