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

RPM_NAME = "python310-azure-messaging-webpubsubclient-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "14bed5a98b19b9106add183cfa9f7182d22e05363d9279bea6cc41922440558c7a7defe8cdb73c90de0643a04d98a63054da0547c4db70e38eddcd32ab4b0d9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-messaging-webpubsubclient \
python3.10dist(azure-messaging-webpubsubclient) \
python310-azure-messaging-webpubsubclient \
python3dist(azure-messaging-webpubsubclient)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-core \
python310-azure-messaging-nspkg \
python310-azure-nspkg \
python310-isodate \
python310-websocket-client"

inherit rpm
