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

RPM_NAME = "perl-Plack-Middleware-LogErrors-0.003-1.17.noarch.rpm"
RPM_HASH = "489b941d36e5c3ef94209dc20e71a666e94f9b34697a126f54596973bfbc719640474c7c96dc4d5005c7d37009f734a6644e7941eceab9b40a8476e450d89ae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--Middleware--LogErrors \
perl-Plack-Middleware-LogErrors"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Plack--Middleware \
perl-Plack--Util--Accessor \
perl-parent"

inherit rpm
