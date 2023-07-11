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

RPM_NAME = "perl-Mojo-Log-Colored-0.04-1.11.noarch.rpm"
RPM_HASH = "7dc8a71bf38534639264fae73b6e0a32ba091b1c238a5876f121004dc01f9e13074768b013e04e4d1d0d16908b9bd8606ae0a1fa289781d632b05527adfdbac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--Log--Colored \
perl-Mojo-Log-Colored"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Mojolicious \
perl-Term--ANSIColor"

inherit rpm
