SUMMARY = "Enhancing Test::More for UTF8-based projects"
DESCRIPTION = "Enhancing Test::More for UTF8-based projects"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-Test-More-UTF8-0.05-1.19.noarch.rpm"
RPM_HASH = "e32fcb497d855508d8ccb652845a211b4b785d325f106184c60542cbf624232a1fbd171f044e3ac8bea128d71507431d766746230d61d1a24fc5fb9ce7b5ced7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--More--UTF8 \
perl-Test-More-UTF8"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
