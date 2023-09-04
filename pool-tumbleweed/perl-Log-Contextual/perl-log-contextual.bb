SUMMARY = "Simple logging interface with a contextual log"
DESCRIPTION = "Major benefits: \
 \
* * Efficient \
 \
The default logging functions take blocks, so if a log level is disabled, \
the block will not run: \
 \
  \
 log_debug { 'the new count in the database is ' . $rs->count }; \
 \
Similarly, the 'D' prefixed methods only 'Dumper' the input if the level is \
enabled. \
 \
* * Handy \
 \
The logging functions return their arguments, so you can stick them in the \
middle of expressions: \
 \
 for (log_debug { 'downloading:\\n' . join qq(\\n), @_ } @urls) { ... } \
 \
* * Generic \
 \
'Log::Contextual' is an interface for all major loggers. If you log through \
'Log::Contextual' you will be able to swap underlying loggers later. \
 \
* * Powerful \
 \
'Log::Contextual' chooses which logger to use based on user defined \
'CodeRef's. Normally you don't need to know this, but you can take \
advantage of it when you need to later. \
 \
* * Scalable \
 \
If you just want to add logging to your basic application, start with \
Log::Contextual::SimpleLogger and then as your needs grow you can switch to \
Log::Dispatchouli or Log::Dispatch or Log::Log4perl or whatever else. \
 \
This module is a simple interface to extensible logging. It exists to \
abstract your logging interface so that logging is as painless as possible, \
while still allowing you to switch from one logger to another. \
 \
It is bundled with a really basic logger, Log::Contextual::SimpleLogger, \
but in general you should use a real logger instead. For something more \
serious but not overly complicated, try Log::Dispatchouli (see SYNOPSIS for \
example.)"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.008001"

RPM_NAME = "perl-Log-Contextual-0.008001-1.20.noarch.rpm"
RPM_HASH = "3b151038eab209651c1990a4125cbdc86e85636a4bda81aedc4de78d42e876d6a04b163d82942da993d3e195274f422001bf74babda3f382c9c0bd4f1298ac6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Contextual \
perl-Log--Contextual--Easy--Default \
perl-Log--Contextual--Easy--Package \
perl-Log--Contextual--Role--Router \
perl-Log--Contextual--Role--Router--HasLogger \
perl-Log--Contextual--Role--Router--SetLogger \
perl-Log--Contextual--Role--Router--WithLogger \
perl-Log--Contextual--Router \
perl-Log--Contextual--SimpleLogger \
perl-Log--Contextual--TeeLogger \
perl-Log--Contextual--WarnLogger \
perl-Log-Contextual"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Data--Dumper--Concise \
perl-Exporter--Declare \
perl-Moo"

inherit rpm
