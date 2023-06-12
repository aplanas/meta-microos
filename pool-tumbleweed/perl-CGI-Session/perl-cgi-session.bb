SUMMARY = "Persistent Session Data in Cgi Applications"
DESCRIPTION = "CGI::Session provides an easy, reliable and modular session management \
system across HTTP requests."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "4.48"

RPM_NAME = "perl-CGI-Session-4.48-15.23.noarch.rpm"
RPM_HASH = "acb05877c984e6267c22332a7ba19b83c38b23b0a293268924c1a24039c8877db6bb46bfa93d5e8a1182261a45c3da4ef2f92f20ffcaa9daf9743b8e32409188"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(CGI::Session) \
perl(CGI::Session::Driver) \
perl(CGI::Session::Driver::DBI) \
perl(CGI::Session::Driver::db_file) \
perl(CGI::Session::Driver::file) \
perl(CGI::Session::Driver::mysql) \
perl(CGI::Session::Driver::postgresql) \
perl(CGI::Session::Driver::sqlite) \
perl(CGI::Session::ErrorHandler) \
perl(CGI::Session::ID::incr) \
perl(CGI::Session::ID::md5) \
perl(CGI::Session::ID::static) \
perl(CGI::Session::Serialize::default) \
perl(CGI::Session::Serialize::freezethaw) \
perl(CGI::Session::Serialize::storable) \
perl(CGI::Session::Test::Default) \
perl(CGI::Session::Test::SimpleObjectClass) \
perl(CGI::Session::Tutorial) \
perl(OverloadedClass) \
perl-CGI-Session"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(CGI)"

inherit rpm
