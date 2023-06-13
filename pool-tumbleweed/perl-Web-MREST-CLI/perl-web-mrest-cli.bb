SUMMARY = "CLI components for Web::MEST-based applications"
DESCRIPTION = "Top-level module of the Web::MREST::CLI distribution. Exports some \
'generalized' functions that are used internally and might also be useful \
for writing CLI clients in general."
LICENSE = "BSD-3-Clause"

PV = "0.284"

RPM_NAME = "perl-Web-MREST-CLI-0.284-1.4.noarch.rpm"
RPM_HASH = "cc8ea324a33078cba1b1117029c1d320feae158090c58db84b56094dbac161e6471ce36ac0ee0b6efade87e9daf0748e20f14af65b189b691c3e997f4f37179b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Web::MREST::CLI) \
perl(Web::MREST::CLI::Parser) \
perl-Web-MREST-CLI"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(App::CELL) \
perl(File::HomeDir) \
perl(File::ShareDir) \
perl(HTTP::Request::Common) \
perl(JSON) \
perl(LWP::Protocol::https) \
perl(LWP::UserAgent) \
perl(Log::Any::Adapter) \
perl(Params::Validate) \
perl(Test::Deep) \
perl(Try::Tiny) \
perl(URI::Escape)"

inherit rpm
