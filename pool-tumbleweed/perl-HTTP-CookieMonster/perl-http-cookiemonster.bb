SUMMARY = "Easy read/write access to your jar of HTTP::Cookies"
DESCRIPTION = "This module was created because messing around with HTTP::Cookies is \
non-trivial. HTTP::Cookies a very useful module, but using it is not always \
as easy and clean as it could be. For instance, if you want to find a \
particular cookie, you can't just ask for it by name."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-HTTP-CookieMonster-0.11-1.12.noarch.rpm"
RPM_HASH = "49d90feea69119e1c8c0fe0eefad5130e21191423dfec645cb3c5091f8a846167403a8d8e24f31163948acedd414e527fc441e68e93373c5afd92e8e44697ee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--CookieMonster \
perl-HTTP--CookieMonster--Cookie \
perl-HTTP-CookieMonster"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTTP--Cookies \
perl-Moo \
perl-Safe--Isa \
perl-Sub--Exporter \
perl-URI--Escape"

inherit rpm
