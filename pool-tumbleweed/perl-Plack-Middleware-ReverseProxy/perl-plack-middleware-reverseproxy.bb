SUMMARY = "Supports app to run as a reverse proxy backend"
DESCRIPTION = "Plack::Middleware::ReverseProxy resets some HTTP headers, which changed by \
reverse-proxy. You can specify the reverse proxy address and stop fake \
requests using 'enable_if' directive in your app.psgi."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16"

RPM_NAME = "perl-Plack-Middleware-ReverseProxy-0.16-1.10.noarch.rpm"
RPM_HASH = "cc79b83a955a3d472a7f4cec881d3e7227d38cc61123f8f75ca6dc49a27984ecce25e4c7036cd3327a7c8c9dd588a2b424f8c7f23da41b360388174fa6eabec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--Middleware--ReverseProxy \
perl-Plack-Middleware-ReverseProxy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Plack \
perl-Plack--Middleware \
perl-Plack--Request \
perl-parent"

inherit rpm
