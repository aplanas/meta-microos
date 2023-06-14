SUMMARY = "Minimalistic HTML/XML DOM parser with CSS selectors"
DESCRIPTION = "Mojo::DOM58 is a minimalistic and relaxed pure-perl HTML/XML DOM parser \
based on Mojo::DOM. It supports the at https://html.spec.whatwg.org/ and at \
https://www.w3.org/TR/xml/, and matching based on at \
https://www.w3.org/TR/selectors/. It will even try to interpret broken HTML \
and XML, so you should not use it for validation."
LICENSE = "Artistic-2.0"

PV = "3.001"

RPM_NAME = "perl-Mojo-DOM58-3.001-1.9.noarch.rpm"
RPM_HASH = "620c43de7570369c46055d229d9077483932eae7838e74a978f950cbb1a88f124ccdfc2860ca8e0fd4b3a8689f1cc6f6333f5c607047eda76fc323bbc6630321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--DOM58 \
perl-Mojo--DOM58---CSS \
perl-Mojo--DOM58---Collection \
perl-Mojo--DOM58---HTML \
perl-Mojo--DOM58--Entities \
perl-Mojo-DOM58"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
