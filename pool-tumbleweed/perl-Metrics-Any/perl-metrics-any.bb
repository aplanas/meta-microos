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

PV = "0.100.0"

RPM_NAME = "perl-Metrics-Any-0.100.0-1.2.noarch.rpm"
RPM_HASH = "43cd4dba08d1bb7fa5e2d4ed623f7fe120da968f30df770d63fc48bcd058638d7e92695c83a22a128c33500cb2fbc9d29573794f86135fa6ae7902f7977fb2f6"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-List--Util"

inherit rpm
