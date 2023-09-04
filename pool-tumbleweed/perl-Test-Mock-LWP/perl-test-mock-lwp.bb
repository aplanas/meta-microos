SUMMARY = "Easy mocking of LWP packages"
DESCRIPTION = "This package arises from duplicating the same code to mock LWP et al in \
several different modules I've written. This version is very minimalist, \
but works for my needs so far. I'm very open to new suggestions and \
improvements."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.08"

RPM_NAME = "perl-Test-Mock-LWP-0.08-4.22.noarch.rpm"
RPM_HASH = "8d4a7259f1184e662759bdfabb9ea68e93e22d38de9ac694af7e05412d7a2be58869c9f4e1c38d76831c3c44d50ab63cca700a81ef750ffcf4773e91715baa17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Mock--HTTP--Request \
perl-Test--Mock--HTTP--Response \
perl-Test--Mock--LWP \
perl-Test--Mock--LWP--UserAgent \
perl-Test-Mock-LWP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--MockObject"

inherit rpm
