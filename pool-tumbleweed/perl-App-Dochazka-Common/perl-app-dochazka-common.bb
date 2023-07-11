SUMMARY = "Dochazka Attendance and Time Tracking System shared modules"
DESCRIPTION = "This distro contains modules that are used by both the server the \
App::Dochazka::REST manpage and the command-line client the \
App::Dochazka::CLI manpage."
LICENSE = "BSD-3-Clause"

PV = "0.210"

RPM_NAME = "perl-App-Dochazka-Common-0.210-1.3.noarch.rpm"
RPM_HASH = "8973b36cb86396052018001b63f15fb2338cbca1d165bf1c2480ab1ec36d2884abcc4ea467a004cbea92e8d830a5f3739e9b025edeabeeac1daa9066f795f3fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--Dochazka--Common \
perl-App--Dochazka--Common--Model \
perl-App--Dochazka--Common--Model--Activity \
perl-App--Dochazka--Common--Model--Component \
perl-App--Dochazka--Common--Model--Employee \
perl-App--Dochazka--Common--Model--Interval \
perl-App--Dochazka--Common--Model--Lock \
perl-App--Dochazka--Common--Model--Policy \
perl-App--Dochazka--Common--Model--Privhistory \
perl-App--Dochazka--Common--Model--Schedhistory \
perl-App--Dochazka--Common--Model--Schedintvls \
perl-App--Dochazka--Common--Model--Schedule \
perl-App--Dochazka--Common--Model--Tempintvl \
perl-App-Dochazka-Common"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Params--Validate \
perl-Test--Deep--NoTest \
perl-Time--Piece \
perl-Time--Seconds"

inherit rpm
