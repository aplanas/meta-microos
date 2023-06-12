SUMMARY = "Mojolicious server status"
DESCRIPTION = "Mojolicious::Plugin::Status is a Mojolicious plugin providing a server \
status ui for Mojo::Server::Daemon and Mojo::Server::Prefork. Note that \
this module is *EXPERIMENTAL* and should therefore only be used for \
debugging purposes."
LICENSE = "Artistic-2.0"

PV = "1.17"

RPM_NAME = "perl-Mojolicious-Plugin-Status-1.17-1.10.noarch.rpm"
RPM_HASH = "adbaf6c9512c1be332c5e069ca150e93c299d15170985278554d281ba45f36df79b5d316676f6f09be98e86e646c825bbb3ec08b160fd5ec4b7638fd311b85fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Mojo::MemoryMap) \
perl(Mojo::MemoryMap::Writer) \
perl(Mojolicious::Plugin::Status) \
perl-Mojolicious-Plugin-Status"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(BSD::Resource) \
perl(File::Map) \
perl(File::Temp) \
perl(Mojolicious) \
perl(Sereal)"

inherit rpm
