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

RPM_NAME = "python311-azure-messaging-webpubsubclient-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "d95fc3a18d67487db520beb9617230324555dc1b30896dd2c4a08aff7f9de4e677c137457d81f441909ae284bd93cd7e15b2aab1adbcebb5c6563b9f1ee567d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-messaging-webpubsubclient \
python3.11dist-azure-messaging-webpubsubclient \
python311-azure-messaging-webpubsubclient \
python3dist-azure-messaging-webpubsubclient"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-messaging-nspkg \
python311-azure-nspkg \
python311-isodate \
python311-websocket-client"

inherit rpm
