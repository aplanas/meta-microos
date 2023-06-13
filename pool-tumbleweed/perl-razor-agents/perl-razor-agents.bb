SUMMARY = "The required perl modules for razor-agents"
DESCRIPTION = "razor-agents are little programs to retrieve or update information \
from the razor <http://razor.sourceforge.net/> network to exchange \
signatures of SPAM. This package contains the required perl modules."
LICENSE = "Artistic-1.0"

PV = "2.86"

RPM_NAME = "perl-razor-agents-2.86-1.4.aarch64.rpm"
RPM_HASH = "73c28df4889ce2632a248747d04d890a325984e4fc71a0ea53a7feb8a51b8a11fd1f55b869ada04a239b7f0c67bb9ba50a0813916a72d8696239579cad39c261"

RPROVIDES:${PN} += "perl(Razor2::Client::Agent) \
perl(Razor2::Client::Config) \
perl(Razor2::Client::Core) \
perl(Razor2::Client::Engine) \
perl(Razor2::Client::Version) \
perl(Razor2::Engine::VR8) \
perl(Razor2::Errorhandler) \
perl(Razor2::Logger) \
perl(Razor2::Preproc::Manager) \
perl(Razor2::Preproc::deBase64) \
perl(Razor2::Preproc::deHTML) \
perl(Razor2::Preproc::deHTML_comment) \
perl(Razor2::Preproc::deHTMLxs) \
perl(Razor2::Preproc::deNewline) \
perl(Razor2::Preproc::deQP) \
perl(Razor2::Preproc::enBase64) \
perl(Razor2::Signature::Ephemeral) \
perl(Razor2::Signature::Whiplash) \
perl(Razor2::String) \
perl(Razor2::Syslog) \
perl-razor-agents \
perl-razor-agents(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl-Digest-SHA1 \
perl-URI"

inherit rpm
