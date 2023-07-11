SUMMARY = "Mojolicious server status"
DESCRIPTION = "Mojolicious::Plugin::Status is a Mojolicious plugin providing a server \
status ui for Mojo::Server::Daemon and Mojo::Server::Prefork. Note that \
this module is *EXPERIMENTAL* and should therefore only be used for \
debugging purposes."
LICENSE = "Artistic-2.0"

PV = "1.17"

RPM_NAME = "perl-Mojolicious-Plugin-Status-1.17-1.11.noarch.rpm"
RPM_HASH = "c6b6ebcce12d73c5e6bbc51bd942c45383db9f0f4d405d08a224bc2e25e1fc2334abcff0d2148e67a0dfee42655f240f7c0aa3e274428918650bbd19d912a5a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--MemoryMap \
perl-Mojo--MemoryMap--Writer \
perl-Mojolicious--Plugin--Status \
perl-Mojolicious-Plugin-Status"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-BSD--Resource \
perl-File--Map \
perl-File--Temp \
perl-Mojolicious \
perl-Sereal"

inherit rpm
