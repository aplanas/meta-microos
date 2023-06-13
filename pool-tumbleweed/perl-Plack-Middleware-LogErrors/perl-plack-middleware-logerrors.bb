SUMMARY = "Map psgi.errors to psgix.logger or other logger"
DESCRIPTION = "'psgi.errors' defaults to 'STDERR' in most backends, which results in \
content going somewhere unhelpful like the server console. \
 \
This middleware simply remaps the 'psgi.errors' stream to the \
'psgix.logger' stream, or an explicit logger that you provide. \
 \
This is especially handy when used in combination with other middlewares \
such as Plack::Middleware::LogWarn (which diverts Perl warnings to \
'psgi.errors'); Plack::Middleware::HTTPExceptions (which diverts uncaught \
exceptions to 'psgi.errors'); and Plack::Middleware::AccessLog, which \
defaults to 'psgi.errors' when not passed a logger -- which is also \
automatically applied via plackup (so if you provided no '--access-log' \
option indicating a filename, 'psgi.errors' is used)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.003"

RPM_NAME = "perl-Plack-Middleware-LogErrors-0.003-1.16.noarch.rpm"
RPM_HASH = "8bbffeb4ce259625271666de96a2690bbea362afe8b5c8e0b611b5f12309d764d01e8a7b73d16d3c7bb226828fdfdadf8689f78735e7d3801dcee5ea201ac7f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Plack::Middleware::LogErrors) \
perl-Plack-Middleware-LogErrors"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Plack::Middleware) \
perl(Plack::Util::Accessor) \
perl(parent)"

inherit rpm
