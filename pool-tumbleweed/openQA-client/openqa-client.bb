SUMMARY = "Client tools for remote openQA management"
DESCRIPTION = "Tools and support files for openQA client script. Client script is \
a convenient helper for interacting with openQA webui REST API."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1685738164.28716cd"

RPM_NAME = "openQA-client-4.6.1685738164.28716cd-1.1.aarch64.rpm"
RPM_HASH = "f168daf7732be9c5b13f6fa38c5e977755d4c78b6383ab5af4a8efee25fd65bb5c6cedde31391b209299d927dfa90f4396865cf28c95e408a2fa521603aa2ae3"

RPROVIDES:${PN} += "openQA-client \
openQA-client(aarch-64) \
perl(OpenQA::Client) \
perl(OpenQA::Client::Archive) \
perl(OpenQA::Client::Handler) \
perl(OpenQA::Client::Upload) \
perl(OpenQA::UserAgent)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/perl \
curl \
git-core \
jq \
openQA-common \
perl(Getopt::Long::Descriptive) \
perl(IO::Socket::SSL) \
perl(IPC::Run) \
perl(JSON::Validator) \
perl(LWP::Protocol::https) \
perl(LWP::UserAgent) \
perl(Test::More) \
perl(YAML::PP) \
perl(YAML::XS)"

inherit rpm
