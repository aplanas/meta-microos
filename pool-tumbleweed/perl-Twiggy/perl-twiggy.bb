SUMMARY = "AnyEvent HTTP server for PSGI"
DESCRIPTION = "Twiggy is a lightweight and fast HTTP server with unique features such as: \
 \
* PSGI \
 \
Can run any PSGI applications. Fully supports _psgi.nonblocking_ and \
_psgi.streaming_ interfaces. \
 \
* AnyEvent \
 \
This server uses AnyEvent and runs in a non-blocking event loop, so it's \
best to run event-driven web applications that runs I/O bound jobs or \
delayed responses such as long-poll, WebSocket or streaming content (server \
push). \
 \
This software used to be called Plack::Server::AnyEvent but was renamed to \
Twiggy. \
 \
* Fast header parser \
 \
Uses XS/C based HTTP header parser for the best performance. (optional, \
install the HTTP::Parser::XS module to enable it; see also \
Plack::HTTPParser for more information). \
 \
* Lightweight and Fast \
 \
The memory required to run twiggy is 6MB and it can serve more than 4500 \
req/s with a single process on Perl 5.10 with MacBook Pro 13' late 2009. \
 \
* Superdaemon aware \
 \
Supports Server::Starter for hot deploy and graceful restarts. \
 \
To use it, instead of the usual: \
 \
    plackup --server Twiggy --port 8111 app.psgi \
 \
install Server::Starter and use: \
 \
    start_server --port 8111 -- plackup --server Twiggy app.psgi"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.1026"

RPM_NAME = "perl-Twiggy-0.1026-1.10.noarch.rpm"
RPM_HASH = "de6afad938ccf4869e95af8f630d5a4c361174f74193996f6ba29b6489d89cc350602571155def4cadbef4b5902d30448725bcf9dd83164eaf1c7cf1efccfa58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(AnyEvent::Server::PSGI) \
perl(Plack::Handler::Twiggy) \
perl(Twiggy) \
perl(Twiggy::Server) \
perl(Twiggy::Server::SS) \
perl(Twiggy::Writer) \
perl-Twiggy"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(AnyEvent) \
perl(HTTP::Status) \
perl(Plack) \
perl(Try::Tiny)"

inherit rpm
