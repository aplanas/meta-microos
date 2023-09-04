SUMMARY = "Temporarily Set Config or Xsconfig Values"
DESCRIPTION = "temporarily set Config or XSConfig values"
LICENSE = "Artistic-2.0"

PV = "0.03"

RPM_NAME = "perl-Mock-Config-0.03-1.23.noarch.rpm"
RPM_HASH = "2a3c3eb43d0714fe0683bba86c7d6537e0e06610e8e0c26e4eb212378ce586e3f7db7920c9e5a9cf6228cfb2c36b0afe4f412e5514488740f697977fc26e8370"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mock--Config \
perl-Mock-Config"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
