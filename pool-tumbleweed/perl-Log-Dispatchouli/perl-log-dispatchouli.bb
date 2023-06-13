SUMMARY = "Simple wrapper around Log::Dispatch"
DESCRIPTION = "Log::Dispatchouli is a thin layer above Log::Dispatch and meant to make it \
dead simple to add logging to a program without having to think much about \
categories, facilities, levels, or things like that. It is meant to make \
logging just configurable enough that you can find the logs you want and \
just easy enough that you will actually log things. \
 \
Log::Dispatchouli can log to syslog (if you specify a facility), standard \
error or standard output, to a file, or to an array in memory. That last \
one is mostly useful for testing. \
 \
In addition to providing as simple a way to get a handle for logging \
operations, Log::Dispatchouli uses String::Flogger to process the things to \
be logged, meaning you can easily log data structures. Basically: strings \
are logged as is, arrayrefs are taken as (sprintf format, args), and \
subroutines are called only if needed. For more information read the \
String::Flogger docs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.002"

RPM_NAME = "perl-Log-Dispatchouli-3.002-1.2.noarch.rpm"
RPM_HASH = "4674cac40efadc15dac95db6f564af06816a8953bdb5234c4c73a4bbbb7b44b7fd0b5a518dd4a5e1622b179f4877a0b9637b86be912010e6dc5ad84c7e482368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Log::Dispatchouli) \
perl(Log::Dispatchouli::Global) \
perl(Log::Dispatchouli::Proxy) \
perl(Log::Fmt) \
perl-Log-Dispatchouli"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Log::Dispatch) \
perl(Log::Dispatch::Array) \
perl(Log::Dispatch::File) \
perl(Log::Dispatch::Screen) \
perl(Log::Dispatch::Syslog) \
perl(Params::Util) \
perl(String::Flogger) \
perl(Sub::Exporter) \
perl(Sub::Exporter::GlobExporter) \
perl(Sys::Syslog) \
perl(Try::Tiny) \
perl(experimental)"

inherit rpm
