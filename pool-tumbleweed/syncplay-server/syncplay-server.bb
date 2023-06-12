SUMMARY = "Server for the Syncplay media synchronizing application"
DESCRIPTION = "The server applciation for Syncplay, acts as a hub for other users \
to connect to and watch videos together in synchronization."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "syncplay-server-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "74455eac8e45b352be0f4b75dbdfa86247042b0a7950337ee862c20d15399f4f0112103bf5e30c31257fe48e217788396abeff86a131d602a10e4d80b7aab7ae"

RPROVIDES:${PN} += "application() \
application(syncplay-server.desktop) \
syncplay-server \
syncplay-server(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python3-Twisted \
syncplay-common"

inherit rpm
