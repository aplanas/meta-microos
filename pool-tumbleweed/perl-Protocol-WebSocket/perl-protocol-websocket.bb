SUMMARY = "WebSocket protocol"
DESCRIPTION = "Client/server WebSocket message and frame parser/constructor. This module \
does not provide a WebSocket server or client, but is made for using in \
http servers or clients to provide WebSocket support. \
 \
Protocol::WebSocket supports the following WebSocket protocol versions: \
 \
    draft-ietf-hybi-17 (latest) \
    draft-ietf-hybi-10 \
    draft-ietf-hybi-00 (with HAProxy support) \
    draft-hixie-75 \
 \
By default the latest version is used. The WebSocket version is detected \
automatically on the server side. On the client side you have set a \
'version' attribute to an appropriate value. \
 \
Protocol::WebSocket itself does not contain any code and cannot be used \
directly. Instead the following modules should be used:"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.26"

RPM_NAME = "perl-Protocol-WebSocket-0.26-1.17.noarch.rpm"
RPM_HASH = "4e0749ed40277bc61b29ec7821ee4b941cc1c3544f17fba88e41e249347d9136cca5bc609db2c25bcb77b40ef3e103b3a696306dcb90992a91d4bfc7da8bddf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Protocol--WebSocket \
perl-Protocol--WebSocket--Client \
perl-Protocol--WebSocket--Cookie \
perl-Protocol--WebSocket--Cookie--Request \
perl-Protocol--WebSocket--Cookie--Response \
perl-Protocol--WebSocket--Frame \
perl-Protocol--WebSocket--Handshake \
perl-Protocol--WebSocket--Handshake--Client \
perl-Protocol--WebSocket--Handshake--Server \
perl-Protocol--WebSocket--Message \
perl-Protocol--WebSocket--Request \
perl-Protocol--WebSocket--Response \
perl-Protocol--WebSocket--Stateful \
perl-Protocol--WebSocket--URL \
perl-Protocol-WebSocket"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Digest--SHA"

inherit rpm
