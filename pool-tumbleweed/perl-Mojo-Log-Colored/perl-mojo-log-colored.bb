SUMMARY = "Colored Mojo logging"
DESCRIPTION = "Mojo::Log::Colored is a logger for Mojolicious with colored output for the \
terminal. It lets you define colors for each log level based on \
Term::ANSIColor and comes with sensible default colors. The full lines in \
the log will be colored. \
 \
Since this inherits from Mojo::Log you can still give it a 'file', but the \
output would also be colored. That does not make a lot of sense, so you \
don't want to do that. Use this for development, not production."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.04"

RPM_NAME = "perl-Mojo-Log-Colored-0.04-1.10.noarch.rpm"
RPM_HASH = "edcfb15d42b6c855a082859cfb184922c34f4052102544e42882be1ad6d8cf19d88c0bd032c1152fe2efa578dadbe3d829bee535b181067ce8e3dc93d548e608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Mojo::Log::Colored) \
perl-Mojo-Log-Colored"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Mojolicious) \
perl(Term::ANSIColor)"

inherit rpm
