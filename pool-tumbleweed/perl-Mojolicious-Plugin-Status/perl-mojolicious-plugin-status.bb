SUMMARY = "Mojolicious server status"
DESCRIPTION = "Mojolicious::Plugin::Status is a Mojolicious plugin providing a server \
status ui for Mojo::Server::Daemon and Mojo::Server::Prefork. Note that \
this module is *EXPERIMENTAL* and should therefore only be used for \
debugging purposes."
LICENSE = "Artistic-2.0"

PV = "1.17"

RPM_NAME = "perl-Mojolicious-Plugin-Status-1.17-1.12.noarch.rpm"
RPM_HASH = "61b3b0b82c1f98a63dcf75888e733852620a44951c4ffe55bd2bc3524a2910efaca510ba69b5e9626c6a2ecc89e06322159f588d0b5cd4b586915ce60358560c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--MemoryMap \
perl-Mojo--MemoryMap--Writer \
perl-Mojolicious--Plugin--Status \
perl-Mojolicious-Plugin-Status"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-BSD--Resource \
perl-File--Map \
perl-File--Temp \
perl-Mojolicious \
perl-Sereal"

inherit rpm
