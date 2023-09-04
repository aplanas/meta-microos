SUMMARY = "Minimalistic HTML/XML DOM parser with CSS selectors"
DESCRIPTION = "Mojo::DOM58 is a minimalistic and relaxed pure-perl HTML/XML DOM parser \
based on Mojo::DOM. It supports the at https://html.spec.whatwg.org/ and at \
https://www.w3.org/TR/xml/, and matching based on at \
https://www.w3.org/TR/selectors/. It will even try to interpret broken HTML \
and XML, so you should not use it for validation."
LICENSE = "Artistic-2.0"

PV = "3.001"

RPM_NAME = "perl-Mojo-DOM58-3.001-1.11.noarch.rpm"
RPM_HASH = "95144e4628c3a3107c705b973dce134e6823df6252a67fd5502b0b9107aa91f497a60878e3604e3f8727cc13a36157f5a2e84d9055d5c2bd943f69947a734833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--DOM58 \
perl-Mojo--DOM58---CSS \
perl-Mojo--DOM58---Collection \
perl-Mojo--DOM58---HTML \
perl-Mojo--DOM58--Entities \
perl-Mojo-DOM58"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
