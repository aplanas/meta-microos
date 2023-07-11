SUMMARY = "Minimalistic HTML/XML DOM parser with CSS selectors"
DESCRIPTION = "Mojo::DOM58 is a minimalistic and relaxed pure-perl HTML/XML DOM parser \
based on Mojo::DOM. It supports the at https://html.spec.whatwg.org/ and at \
https://www.w3.org/TR/xml/, and matching based on at \
https://www.w3.org/TR/selectors/. It will even try to interpret broken HTML \
and XML, so you should not use it for validation."
LICENSE = "Artistic-2.0"

PV = "3.001"

RPM_NAME = "perl-Mojo-DOM58-3.001-1.10.noarch.rpm"
RPM_HASH = "8eb5e55d0b3c012109bbca6d2fcc095c053a5f3af824d50ab20f93aad8e0e93f463c1d4c8e6faaa50660c3cef10c9797cd62e6f1928bc6a44e13549305a3600a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--DOM58 \
perl-Mojo--DOM58---CSS \
perl-Mojo--DOM58---Collection \
perl-Mojo--DOM58---HTML \
perl-Mojo--DOM58--Entities \
perl-Mojo-DOM58"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
