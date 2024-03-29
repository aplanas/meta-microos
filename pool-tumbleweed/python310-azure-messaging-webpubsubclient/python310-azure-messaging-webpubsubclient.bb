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

RPM_NAME = "python310-azure-messaging-webpubsubclient-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "ce4bcb4197a4d51e38117bfb15e676fa072bf60ea0430ab535eafccfc656c9cf9def63f1fb26131c7ebe5294bc90d3b903f793d9d74aeb9b415b896cba151617"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-messaging-webpubsubclient \
python310-azure-messaging-webpubsubclient \
python3dist-azure-messaging-webpubsubclient"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-messaging-nspkg \
python310-azure-nspkg \
python310-isodate \
python310-websocket-client"

inherit rpm
