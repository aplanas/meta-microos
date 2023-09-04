SUMMARY = "Assert that code produces metrics via L<Metrics::Any>"
DESCRIPTION = "This test module helps write unit tests which assert that the code under \
test reports metrics via Metrics::Any. \
 \
Loading this module automatically sets the Metrics::Any::Adapter type to \
'Test'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.01"

RPM_NAME = "perl-Test-Metrics-Any-0.01-1.14.noarch.rpm"
RPM_HASH = "69ef5439de2cb8296e119cd463ae30d341e61c48cd2c11a0966d0d96a92a6582f753f4a2a22f5b56d697a16c77b1319b9ae98e7d7a29ad92e0a03403ca75a5d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Metrics--Any \
perl-Test--Metrics--Any---predicate \
perl-Test-Metrics-Any"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Metrics--Any--Adapter \
perl-Metrics--Any--Adapter--Test"

inherit rpm
