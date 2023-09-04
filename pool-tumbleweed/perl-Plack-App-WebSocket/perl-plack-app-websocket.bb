SUMMARY = "WebSocket server as a PSGI application"
DESCRIPTION = "This module is a PSGI application that creates an endpoint for WebSocket \
connections."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-Plack-App-WebSocket-0.08-1.13.noarch.rpm"
RPM_HASH = "87482beb433644f0b91dae6d172dd13f78d89fda8abef1e7f5538c6b91827a47946ba8e332e94e363042f84cf1be3bf720381d87014d48ae7ab426c7c55af17d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--App--WebSocket \
perl-Plack--App--WebSocket--Connection \
perl-Plack-App-WebSocket"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-AnyEvent \
perl-AnyEvent--WebSocket--Server \
perl-Devel--GlobalDestruction \
perl-Plack--Component \
perl-Plack--Response \
perl-Try--Tiny \
perl-parent"

inherit rpm
