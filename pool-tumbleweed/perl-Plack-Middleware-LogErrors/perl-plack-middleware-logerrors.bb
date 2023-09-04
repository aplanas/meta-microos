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

RPM_NAME = "perl-Plack-Middleware-LogErrors-0.003-1.18.noarch.rpm"
RPM_HASH = "0cacb9fb8cff46d271178e1ffbbc9ae607db40e51d101b9b36f0f38835ead53716d9031d13dfd5841e1ca951f096120e2c3bafdce632ef4fba2c0a3ee5674a7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--Middleware--LogErrors \
perl-Plack-Middleware-LogErrors"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Plack--Middleware \
perl-Plack--Util--Accessor \
perl-parent"

inherit rpm
