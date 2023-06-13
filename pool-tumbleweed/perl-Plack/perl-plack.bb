SUMMARY = "Perl Superglue for Web frameworks and Web Servers (PSGI toolkit)"
DESCRIPTION = "Plack is a set of tools for using the PSGI stack. It contains middleware \
components, a reference server and utilities for Web application \
frameworks. Plack is like Ruby's Rack or Python's Paste for WSGI. \
 \
See PSGI for the PSGI specification and PSGI::FAQ to know what PSGI and \
Plack are and why we need them."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0050"

RPM_NAME = "perl-Plack-1.0050-1.2.noarch.rpm"
RPM_HASH = "02cac93dc655dc0cca00f3a6bcd1764f62ecc0281a18a048089fc2fe389340d0f8a765fbde94e122be83dcdf27079aac9aa64b0ed301d92958680164a08201ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::Message::PSGI) \
perl(HTTP::Server::PSGI) \
perl(Plack) \
perl(Plack::App::CGIBin) \
perl(Plack::App::Cascade) \
perl(Plack::App::Directory) \
perl(Plack::App::File) \
perl(Plack::App::PSGIBin) \
perl(Plack::App::URLMap) \
perl(Plack::App::WrapCGI) \
perl(Plack::Builder) \
perl(Plack::Component) \
perl(Plack::HTTPParser) \
perl(Plack::HTTPParser::PP) \
perl(Plack::Handler) \
perl(Plack::Handler::Apache1) \
perl(Plack::Handler::Apache2) \
perl(Plack::Handler::Apache2::Registry) \
perl(Plack::Handler::CGI) \
perl(Plack::Handler::CGI::Writer) \
perl(Plack::Handler::FCGI) \
perl(Plack::Handler::HTTP::Server::PSGI) \
perl(Plack::Handler::Standalone) \
perl(Plack::LWPish) \
perl(Plack::Loader) \
perl(Plack::Loader::Delayed) \
perl(Plack::Loader::Restarter) \
perl(Plack::Loader::Shotgun) \
perl(Plack::MIME) \
perl(Plack::Middleware) \
perl(Plack::Middleware::AccessLog) \
perl(Plack::Middleware::AccessLog::Timed) \
perl(Plack::Middleware::Auth::Basic) \
perl(Plack::Middleware::BufferedStreaming) \
perl(Plack::Middleware::Chunked) \
perl(Plack::Middleware::Conditional) \
perl(Plack::Middleware::ConditionalGET) \
perl(Plack::Middleware::ContentLength) \
perl(Plack::Middleware::ContentMD5) \
perl(Plack::Middleware::ErrorDocument) \
perl(Plack::Middleware::HTTPExceptions) \
perl(Plack::Middleware::Head) \
perl(Plack::Middleware::IIS6ScriptNameFix) \
perl(Plack::Middleware::IIS7KeepAliveFix) \
perl(Plack::Middleware::JSONP) \
perl(Plack::Middleware::LighttpdScriptNameFix) \
perl(Plack::Middleware::Lint) \
perl(Plack::Middleware::Log4perl) \
perl(Plack::Middleware::LogDispatch) \
perl(Plack::Middleware::NullLogger) \
perl(Plack::Middleware::RearrangeHeaders) \
perl(Plack::Middleware::Recursive) \
perl(Plack::Middleware::Refresh) \
perl(Plack::Middleware::Runtime) \
perl(Plack::Middleware::SimpleContentFilter) \
perl(Plack::Middleware::SimpleLogger) \
perl(Plack::Middleware::StackTrace) \
perl(Plack::Middleware::Static) \
perl(Plack::Middleware::XFramework) \
perl(Plack::Middleware::XSendfile) \
perl(Plack::Recursive::ForwardRequest) \
perl(Plack::Request) \
perl(Plack::Request::Upload) \
perl(Plack::Response) \
perl(Plack::Runner) \
perl(Plack::TempBuffer) \
perl(Plack::Test) \
perl(Plack::Test::MockHTTP) \
perl(Plack::Test::Server) \
perl(Plack::Test::Suite) \
perl(Plack::Util) \
perl(Plack::Util::Accessor) \
perl(Plack::Util::IOWithPath) \
perl(Plack::Util::Prototype) \
perl-Plack"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(Apache::LogFormat::Compiler) \
perl(Cookie::Baker) \
perl(Devel::StackTrace) \
perl(Devel::StackTrace::AsHTML) \
perl(File::ShareDir) \
perl(Filesys::Notify::Simple) \
perl(HTTP::Entity::Parser) \
perl(HTTP::Headers::Fast) \
perl(HTTP::Message) \
perl(HTTP::Tiny) \
perl(Hash::MultiValue) \
perl(Pod::Usage) \
perl(Stream::Buffered) \
perl(Test::TCP) \
perl(Try::Tiny) \
perl(URI) \
perl(WWW::Form::UrlEncoded) \
perl(parent)"

inherit rpm
