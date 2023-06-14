SUMMARY = "Assert that code produces metrics via L<Metrics::Any>"
DESCRIPTION = "This test module helps write unit tests which assert that the code under \
test reports metrics via Metrics::Any. \
 \
Loading this module automatically sets the Metrics::Any::Adapter type to \
'Test'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.01"

RPM_NAME = "perl-Test-Metrics-Any-0.01-1.12.noarch.rpm"
RPM_HASH = "5a04f1aa4ef77a77eb45fa526c4162a7197985b9c1b2414cda5f722edf0b6babfe7576e10484b9d353885231b771ce47b8cb160cd33092e8a6dba020e79d00f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Metrics--Any \
perl-Test--Metrics--Any---predicate \
perl-Test-Metrics-Any"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Metrics--Any--Adapter \
perl-Metrics--Any--Adapter--Test"

inherit rpm
