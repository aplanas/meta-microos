SUMMARY = "Easy read/write access to your jar of HTTP::Cookies"
DESCRIPTION = "This module was created because messing around with HTTP::Cookies is \
non-trivial. HTTP::Cookies a very useful module, but using it is not always \
as easy and clean as it could be. For instance, if you want to find a \
particular cookie, you can't just ask for it by name."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-HTTP-CookieMonster-0.11-1.11.noarch.rpm"
RPM_HASH = "d249264d7e831203435723d3e3ef27cb2f441e7e251e89c8a04503360c7fb234f60eb6be316a464f79b74aa31626a1425daa628d5128c844bd979bb4f64b8e3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--CookieMonster \
perl-HTTP--CookieMonster--Cookie \
perl-HTTP-CookieMonster"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTTP--Cookies \
perl-Moo \
perl-Safe--Isa \
perl-Sub--Exporter \
perl-URI--Escape"

inherit rpm
