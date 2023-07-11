SUMMARY = "Assert that code produces metrics via L<Metrics::Any>"
DESCRIPTION = "This test module helps write unit tests which assert that the code under \
test reports metrics via Metrics::Any. \
 \
Loading this module automatically sets the Metrics::Any::Adapter type to \
'Test'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.01"

RPM_NAME = "perl-Test-Metrics-Any-0.01-1.13.noarch.rpm"
RPM_HASH = "90a34bf1509e64231c120467ed0c1496ed2b9616991a2154cd1530d5634059d0c713f0371b5b68f8bd75be1769979cd1510169fd51846676529ee12067cbd4ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Metrics--Any \
perl-Test--Metrics--Any---predicate \
perl-Test-Metrics-Any"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Metrics--Any--Adapter \
perl-Metrics--Any--Adapter--Test"

inherit rpm
