SUMMARY = "Dochazka Attendance and Time Tracking System shared modules"
DESCRIPTION = "This distro contains modules that are used by both the server the \
App::Dochazka::REST manpage and the command-line client the \
App::Dochazka::CLI manpage."
LICENSE = "BSD-3-Clause"

PV = "0.210"

RPM_NAME = "perl-App-Dochazka-Common-0.210-1.2.noarch.rpm"
RPM_HASH = "eb7f8d37510c9173ebb4a60de27c0b7354e9f1328ac2fb054698ec5c288bc62d2c17dde8c9e29a8bbe176fbbe0efadb25d14ec06ac2f49e0e83612235199a264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(App::Dochazka::Common) \
perl(App::Dochazka::Common::Model) \
perl(App::Dochazka::Common::Model::Activity) \
perl(App::Dochazka::Common::Model::Component) \
perl(App::Dochazka::Common::Model::Employee) \
perl(App::Dochazka::Common::Model::Interval) \
perl(App::Dochazka::Common::Model::Lock) \
perl(App::Dochazka::Common::Model::Policy) \
perl(App::Dochazka::Common::Model::Privhistory) \
perl(App::Dochazka::Common::Model::Schedhistory) \
perl(App::Dochazka::Common::Model::Schedintvls) \
perl(App::Dochazka::Common::Model::Schedule) \
perl(App::Dochazka::Common::Model::Tempintvl) \
perl-App-Dochazka-Common"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Params::Validate) \
perl(Test::Deep::NoTest) \
perl(Time::Piece) \
perl(Time::Seconds)"

inherit rpm
