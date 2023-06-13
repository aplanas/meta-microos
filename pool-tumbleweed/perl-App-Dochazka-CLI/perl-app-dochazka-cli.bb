SUMMARY = "Dochazka command line client"
DESCRIPTION = "App::Dochazka::CLI is the Command Line Interface (CLI) component of the \
Dochazka Attendance & Time Tracking system. \
 \
In order to work, the CLI must be pointed at a running App::Dochazka::REST \
(i.e., Dochazka REST server) instance by setting the 'MREST_CLI_URI_BASE' \
meta configuration parameter. \
 \
Detailed documentation covering configuration, deployment, and the commands \
that can be used with the CLI can be found in App::Dochazka::CLI::Guide. \
 \
This module is used to store some 'global' package variables that are used \
throughout the CLI code base."
LICENSE = "BSD-3-Clause"

PV = "0.238"

RPM_NAME = "perl-App-Dochazka-CLI-0.238-1.29.noarch.rpm"
RPM_HASH = "d6d48724820a443a8b04ced885bca5f3b65de02aad9c4ad2d55c83dae61a48da48440d12d70d869eb0d788bc9d93301cc274e4cce41030070a340cff5edf1c9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(perl-App-Dochazka-CLI) \
perl(App::Dochazka::CLI) \
perl(App::Dochazka::CLI::CommandMap) \
perl(App::Dochazka::CLI::Commands::Activity) \
perl(App::Dochazka::CLI::Commands::Component) \
perl(App::Dochazka::CLI::Commands::Employee) \
perl(App::Dochazka::CLI::Commands::History) \
perl(App::Dochazka::CLI::Commands::Interval) \
perl(App::Dochazka::CLI::Commands::Misc) \
perl(App::Dochazka::CLI::Commands::Priv) \
perl(App::Dochazka::CLI::Commands::Schedule) \
perl(App::Dochazka::CLI::Completion) \
perl(App::Dochazka::CLI::Guide) \
perl(App::Dochazka::CLI::Parser) \
perl(App::Dochazka::CLI::Shared) \
perl(App::Dochazka::CLI::Test) \
perl(App::Dochazka::CLI::Testers) \
perl(App::Dochazka::CLI::TokenMap) \
perl(App::Dochazka::CLI::Util) \
perl-App-Dochazka-CLI"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(App::CELL) \
perl(App::Dochazka::Common) \
perl(Date::Calc) \
perl(File::HomeDir) \
perl(File::ShareDir) \
perl(File::Slurp) \
perl(HTTP::Cookies) \
perl(HTTP::Request) \
perl(JSON) \
perl(LWP::UserAgent) \
perl(Params::Validate) \
perl(Term::ReadKey) \
perl(Term::ReadLine::Gnu) \
perl(Text::Table) \
perl(Web::MREST::CLI) \
xdg-utils"

inherit rpm
