SUMMARY = "Python Publish-Subscribe Package"
DESCRIPTION = "PyPubSub provides a publish - subscribe API that facilitates the development of \
event-based / message-based applications. PyPubSub supports sending and \
receiving messages between objects of an application. It is centered on the \
notion of a topic; senders publish messages of a given topic, and listeners \
subscribe to messages of a given topic. The package also supports a variety of \
advanced features that facilitate debugging and maintaining pypubsub topics and \
messages in larger applications."
LICENSE = "BSD-2-Clause"

PV = "4.0.3"

RPM_NAME = "python311-pypubsub-4.0.3-1.8.noarch.rpm"
RPM_HASH = "53b1a78dc60d41617e7cd9ad859d838dcc6ef1d323ebcee22c9a28b6a542ef71d5b767d0c80f74765b27e5099a1ee73f3f7f4b6c83f74bf2c846f76efdc1cf14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pypubsub) \
python311-pypubsub \
python3dist(pypubsub)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
