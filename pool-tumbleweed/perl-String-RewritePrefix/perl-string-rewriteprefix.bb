SUMMARY = "Rewrite strings based on a set of known prefixes"
DESCRIPTION = "rewrite strings based on a set of known prefixes"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.009"

RPM_NAME = "perl-String-RewritePrefix-0.009-1.3.noarch.rpm"
RPM_HASH = "694f5f7e84d937f5b83cb19ffc40de815dc3429e3be4008e1f18dc21b5b1ed30b28a7a83ee9aa04629453915179b1c1bc3422aacd370d632760f2b033ef2f800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--RewritePrefix \
perl-String-RewritePrefix"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Sub--Exporter"

inherit rpm
