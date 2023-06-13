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

RPM_NAME = "python311-azure-messaging-webpubsubclient-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "d4db8e3b295d9f484a3230984d3b42162055d707061f641b8b063e91b2c36221c7169d31647f7d8588d84a32eaf4a63c89a569ad59fe9b88649559e66302faf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-messaging-webpubsubclient) \
python311-azure-messaging-webpubsubclient \
python3dist(azure-messaging-webpubsubclient)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-core \
python311-azure-messaging-nspkg \
python311-azure-nspkg \
python311-isodate \
python311-websocket-client"

inherit rpm
