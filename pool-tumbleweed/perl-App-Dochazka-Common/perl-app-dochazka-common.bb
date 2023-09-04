SUMMARY = "Dochazka Attendance and Time Tracking System shared modules"
DESCRIPTION = "This distro contains modules that are used by both the server the \
App::Dochazka::REST manpage and the command-line client the \
App::Dochazka::CLI manpage."
LICENSE = "BSD-3-Clause"

PV = "0.210"

RPM_NAME = "perl-App-Dochazka-Common-0.210-1.4.noarch.rpm"
RPM_HASH = "0c8aeb55e6c283b035594bd13ad8975ea8c7880aa8e9650c647190790244d96ac91066da8bfce0660724f1d42c0ec068377cac53298c488f20ce59cdc6c18fff"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Params--Validate \
perl-Test--Deep--NoTest \
perl-Time--Piece \
perl-Time--Seconds"

inherit rpm
