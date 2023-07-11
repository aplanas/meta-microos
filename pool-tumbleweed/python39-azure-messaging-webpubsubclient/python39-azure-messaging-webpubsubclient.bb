SUMMARY = "Microsoft Azure Web PubSub Client Library for Python"
DESCRIPTION = "Azure Web PubSub is a cloud service that helps developers easily build real-time features \
in web applications with publish-subscribe patterns at scale. \
 \
Any scenario that requires real-time messaging between server and clients or among clients \
following publish-subscribe patterns can benefit from using Web PubSub. Developers no longer \
need to poll the server by sending repeated HTTP requests at intervals, which is wasteful \
and hard-to-scale. \
 \
As shown in the diagram below, your clients establish WebSocket connections with your Web \
PubSub resource. This client library: \
 \
 * simplifies managing client connections \
 * simplifies sending messages among clients \
 * automatically retries after unintended drops of client connection \
 * reliably deliveries messages in number and in order after recovering from connection drops"
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-messaging-webpubsubclient-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "0ff7d92d6c43dc52b2168cbd033f6044d416afcc424f2df828cb78def8c2f54429fb7bd73719ded837b60871f4e0380009e2f417533f4c33071d201c64f06736"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-messaging-webpubsubclient \
python39-azure-messaging-webpubsubclient \
python3dist-azure-messaging-webpubsubclient"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-messaging-nspkg \
python39-azure-nspkg \
python39-isodate \
python39-websocket-client"

inherit rpm
