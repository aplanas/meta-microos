SUMMARY = "Add a websocket interface to your Dancers app"
DESCRIPTION = "'Dancer2::Plugin::WebSocket' provides an interface to Plack::App::WebSocket \
and allows to interact with the webSocket connections within the Dancer \
app. \
 \
Plack::App::WebSocket, and thus this plugin, requires a plack server that \
supports the psgi _streaming_, _nonblocking_ and _io_. Twiggy is the most \
popular server fitting the bill."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.3.1"

RPM_NAME = "perl-Dancer2-Plugin-WebSocket-0.3.1-1.11.noarch.rpm"
RPM_HASH = "3a92fb9811cce80ad75c5af9fb00036200ddd7989c69d33d31235a0951aa037da87c2228744862000d69c4b7a9304ee0e3a3f07b6e55f85731879e25a91107d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Dancer2--Plugin--WebSocket \
perl-Dancer2--Plugin--WebSocket--Connection \
perl-Dancer2--Plugin--WebSocket--Group \
perl-Dancer2-Plugin-WebSocket"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Dancer2--Plugin \
perl-JSON--MaybeXS \
perl-Moo \
perl-Moo--Role \
perl-Plack--App--WebSocket \
perl-Set--Tiny \
perl-Try--Tiny"

inherit rpm
