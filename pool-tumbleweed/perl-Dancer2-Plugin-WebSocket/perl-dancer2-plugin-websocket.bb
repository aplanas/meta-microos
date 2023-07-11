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

RPM_NAME = "perl-Dancer2-Plugin-WebSocket-0.3.1-1.10.noarch.rpm"
RPM_HASH = "e82c6135133a32ab9d9796a6160f5d5450921afd88469960f81e6a5400ee7ce156fc6c0201028800849c15db862fc9c68df4d9f93c6fe1df29b80b2fc03f1a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Dancer2--Plugin--WebSocket \
perl-Dancer2--Plugin--WebSocket--Connection \
perl-Dancer2--Plugin--WebSocket--Group \
perl-Dancer2-Plugin-WebSocket"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Dancer2--Plugin \
perl-JSON--MaybeXS \
perl-Moo \
perl-Moo--Role \
perl-Plack--App--WebSocket \
perl-Set--Tiny \
perl-Try--Tiny"

inherit rpm
