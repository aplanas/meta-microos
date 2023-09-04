SUMMARY = "Camelcase, de-Camelcase"
DESCRIPTION = "camelcase, de-camelcase"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.04"

RPM_NAME = "perl-String-CamelCase-0.04-1.20.noarch.rpm"
RPM_HASH = "7c4ac7414879926e2367be3f9998af5536dff420ec8d4f20d10edc7905ee7d0b78bf6610ed902e7eddf6cd02e375a9d221b3101269a28c57eea0328282c69823"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--CamelCase \
perl-String-CamelCase"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
