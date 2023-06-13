SUMMARY = "Configuration, Error-handling, Localization, and Logging"
DESCRIPTION = "This is the top-level module of App::CELL, the Configuration, \
Error-handling, Localization, and Logging framework for applications (or \
scripts) written in Perl. \
 \
For details, read the POD in the App::CELL distro. For an introduction, \
read App::CELL::Guide."
LICENSE = "BSD-3-Clause"

PV = "0.231"

RPM_NAME = "perl-App-CELL-0.231-1.4.noarch.rpm"
RPM_HASH = "3481c6b9b1d9796b0f73ed9bd3fef2e4de5b5eb0a9d4c3a158f547c9dc866ab04c4d6909bda8f025d5c0c557814699dc914f93157103a8ec479aea38b6a86d41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(App::CELL) \
perl(App::CELL::Config) \
perl(App::CELL::Guide) \
perl(App::CELL::Load) \
perl(App::CELL::Log) \
perl(App::CELL::Message) \
perl(App::CELL::Status) \
perl(App::CELL::Test) \
perl(App::CELL::Test::LogToFile) \
perl(App::CELL::Util) \
perl-App-CELL"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Date::Format) \
perl(File::HomeDir) \
perl(File::Next) \
perl(File::ShareDir) \
perl(Log::Any) \
perl(Log::Any::Adapter) \
perl(Params::Validate) \
perl(Try::Tiny)"

inherit rpm
