SUMMARY = "Supports app to run as a reverse proxy backend"
DESCRIPTION = "Plack::Middleware::ReverseProxy resets some HTTP headers, which changed by \
reverse-proxy. You can specify the reverse proxy address and stop fake \
requests using 'enable_if' directive in your app.psgi."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16"

RPM_NAME = "perl-Plack-Middleware-ReverseProxy-0.16-1.9.noarch.rpm"
RPM_HASH = "12001284e858cc24fb90046a95c9046739222ed510cc78ff561c85c6cb0f5b8b203e9bf9df31b49d2f2bfb1d7a864dcb1f77ca6b3a0063ba0fc7a724d0ca1994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--Middleware--ReverseProxy \
perl-Plack-Middleware-ReverseProxy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Plack \
perl-Plack--Middleware \
perl-Plack--Request \
perl-parent"

inherit rpm
