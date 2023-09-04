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

RPM_NAME = "perl-Mojo-Log-Colored-0.04-1.12.noarch.rpm"
RPM_HASH = "18686b623b4589b6cf63060dcaf52a58e2a9eff15e90e2a44b57818db74da5d6554dfac1f235387dbf0ca6b0bed24eea51bd28d5bdfc6c09bad1cb3e896cb41e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--Log--Colored \
perl-Mojo-Log-Colored"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Mojolicious \
perl-Term--ANSIColor"

inherit rpm
