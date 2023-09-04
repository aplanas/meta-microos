SUMMARY = "Rewrite strings based on a set of known prefixes"
DESCRIPTION = "rewrite strings based on a set of known prefixes"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.009"

RPM_NAME = "perl-String-RewritePrefix-0.009-1.4.noarch.rpm"
RPM_HASH = "d7b7f01d73c9fe9c93a872919a854cc9f8b55c232427e4b5629c0e188785f4bb19a1d61b829d216bef80ddf3f6053de7a45337fbdc5eaca27c959bdd733a128b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--RewritePrefix \
perl-String-RewritePrefix"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Sub--Exporter"

inherit rpm
