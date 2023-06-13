SUMMARY = "Supports app to run as a reverse proxy backend"
DESCRIPTION = "Plack::Middleware::ReverseProxy resets some HTTP headers, which changed by \
reverse-proxy. You can specify the reverse proxy address and stop fake \
requests using 'enable_if' directive in your app.psgi."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16"

RPM_NAME = "perl-Plack-Middleware-ReverseProxy-0.16-1.8.noarch.rpm"
RPM_HASH = "0e7ebdf1d6a4b34d9694d2ae6ebea8da5e7d874c46ea112e519e08b15fad3b12aa6cd6ba9cce9654d3f4686a82b0a954692259d91fb048da165cfba5e400e300"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Plack::Middleware::ReverseProxy) \
perl-Plack-Middleware-ReverseProxy"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Plack) \
perl(Plack::Middleware) \
perl(Plack::Request) \
perl(parent)"

inherit rpm
