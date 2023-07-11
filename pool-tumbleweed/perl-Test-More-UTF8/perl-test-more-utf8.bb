SUMMARY = "Enhancing Test::More for UTF8-based projects"
DESCRIPTION = "Enhancing Test::More for UTF8-based projects"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-Test-More-UTF8-0.05-1.18.noarch.rpm"
RPM_HASH = "75c06fd4585fa20f18bd93823c83ff73c264f7a383de6b1ba5b7ae22460dcb2245401e0edca963fde3c25f37a126a2669fca3baa53dfb7d18e72a54b7833a8b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--More--UTF8 \
perl-Test-More-UTF8"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
