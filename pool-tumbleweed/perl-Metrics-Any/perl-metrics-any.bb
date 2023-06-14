SUMMARY = "Abstract collection of monitoring metrics"
DESCRIPTION = "Provides a central location for modules to report monitoring metrics, such \
as counters of the number of times interesting events have happened, and \
programs to collect up and send those metrics to monitoring services. \
 \
Inspired by Log::Any, this module splits the overall problem into two \
sides. Modules wishing to provide metrics for monitoring purposes can use \
the 'use Metrics::Any' statement to obtain a _collector_ into which they \
can report metric events. By default this collector doesn't actually do \
anything, so modules can easily use it without adding extra specific \
dependencies for specific reporting. \
 \
A program using one or more such modules can apply a different policy and \
request a particular _adapter_ implementation in order to actually report \
these metrics to some external system, by using the 'use \
Metrics::Any::Adapter' statement. \
 \
This separation of concerns allows module authors to write code which will \
report metrics without needing to care about the exact mechanism of that \
reporting (as well as to write code which does not itself depend on the \
code required to perform that reporting)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Metrics-Any-0.09-1.2.noarch.rpm"
RPM_HASH = "70ce11bf3cd384f357594ab9d835b0f5654ce5becbe07cbc238a4db2709d7b74a87696c62052bb66fac861d5b393bae01dd63f11ec250f2ffe9d7e75ad8ce85a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Metrics--Any \
perl-Metrics--Any--Adapter \
perl-Metrics--Any--Adapter--File \
perl-Metrics--Any--Adapter--Null \
perl-Metrics--Any--Adapter--Stderr \
perl-Metrics--Any--Adapter--Tee \
perl-Metrics--Any--Adapter--Test \
perl-Metrics--Any--AdapterBase--Stored \
perl-Metrics--Any--Collector \
perl-Metrics-Any"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-List--Util"

inherit rpm
