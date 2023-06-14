SUMMARY = "Enhancing Test::More for UTF8-based projects"
DESCRIPTION = "Enhancing Test::More for UTF8-based projects"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-Test-More-UTF8-0.05-1.17.noarch.rpm"
RPM_HASH = "31e2f0b76a93511861c3ac6b8a76454abab2b468d3a6e5aee6ceb20640b64e0abbff4b5e8a47018f5bb0bd2488e0dba21410aed2ab2270eebe8415e9dcf54be3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--More--UTF8 \
perl-Test-More-UTF8"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
