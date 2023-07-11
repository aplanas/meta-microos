SUMMARY = "Nested URIs"
DESCRIPTION = "Nested URIs"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.10"

RPM_NAME = "perl-URI-Nested-0.10-1.23.noarch.rpm"
RPM_HASH = "4c089ebf7325eebc204c6dc78c2e67d69613f481c8f53286885a6f0a5d363b4440ee1e68ccdf62e0d4a2249584fdd0725ae454af8f9b1846870cd29273d5b8a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--Nested \
perl-URI-Nested"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-URI"

inherit rpm
