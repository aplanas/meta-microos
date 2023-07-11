SUMMARY = "WebSocket server as a PSGI application"
DESCRIPTION = "This module is a PSGI application that creates an endpoint for WebSocket \
connections."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-Plack-App-WebSocket-0.08-1.12.noarch.rpm"
RPM_HASH = "84f6842f29a1612caba1a6d11739489d4dd7e5f1008efec9ce93f94a1d46d3a79a469c349e2a4053854064e4dd5a5c83d23e43ce74cfb5cf42afb74813a4eed0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--App--WebSocket \
perl-Plack--App--WebSocket--Connection \
perl-Plack-App-WebSocket"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-AnyEvent \
perl-AnyEvent--WebSocket--Server \
perl-Devel--GlobalDestruction \
perl-Plack--Component \
perl-Plack--Response \
perl-Try--Tiny \
perl-parent"

inherit rpm
