SUMMARY = "Temporarily Set Config or Xsconfig Values"
DESCRIPTION = "temporarily set Config or XSConfig values"
LICENSE = "Artistic-2.0"

PV = "0.03"

RPM_NAME = "perl-Mock-Config-0.03-1.22.noarch.rpm"
RPM_HASH = "c499b96e5deec7ff08d536f395d0553cb595a4415602a315e627bfbb4fa29a375736e53413e307f79ac47951ff7d80747f915b9e98db79c26ea192d3ed86ec1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mock--Config \
perl-Mock-Config"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
