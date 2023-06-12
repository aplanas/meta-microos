SUMMARY = "Dispatches messages to one or more outputs"
DESCRIPTION = "This module manages a set of Log::Dispatch::* output objects that can be \
logged to via a unified interface. \
 \
The idea is that you create a Log::Dispatch object and then add various \
logging objects to it (such as a file logger or screen logger). Then you \
call the 'log' method of the dispatch object, which passes the message to \
each of the objects, which in turn decide whether or not to accept the \
message and what to do with it. \
 \
This makes it possible to call single method and send a message to a log \
file, via email, to the screen, and anywhere else, all with very little \
code needed on your part, once the dispatching object has been created."
LICENSE = "Artistic-2.0"

PV = "2.71"

RPM_NAME = "perl-Log-Dispatch-2.71-1.1.noarch.rpm"
RPM_HASH = "2e123dc54a91368fd9bef0cf35d09a3d36b08c2471e07f1935e250562e7a41e660cd2f6251ba9944f771a0316546f71ee7282cbde3c3b523770f0455e0d4f969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Log::Dispatch) \
perl(Log::Dispatch::ApacheLog) \
perl(Log::Dispatch::Base) \
perl(Log::Dispatch::Code) \
perl(Log::Dispatch::Email) \
perl(Log::Dispatch::Email::MIMELite) \
perl(Log::Dispatch::Email::MailSend) \
perl(Log::Dispatch::Email::MailSender) \
perl(Log::Dispatch::Email::MailSendmail) \
perl(Log::Dispatch::File) \
perl(Log::Dispatch::File::Locked) \
perl(Log::Dispatch::Handle) \
perl(Log::Dispatch::Null) \
perl(Log::Dispatch::Output) \
perl(Log::Dispatch::Screen) \
perl(Log::Dispatch::Syslog) \
perl(Log::Dispatch::Types) \
perl(Log::Dispatch::Vars) \
perl-Log-Dispatch"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Devel::GlobalDestruction) \
perl(Dist::CheckConflicts) \
perl(Module::Runtime) \
perl(Params::ValidationCompiler) \
perl(Specio) \
perl(Specio::Declare) \
perl(Specio::Exporter) \
perl(Specio::Library::Builtins) \
perl(Specio::Library::Numeric) \
perl(Specio::Library::String) \
perl(Sys::Syslog) \
perl(Try::Tiny) \
perl(namespace::autoclean) \
perl(parent)"

inherit rpm
