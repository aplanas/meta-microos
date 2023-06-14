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

RPM_NAME = "python310-pypubsub-4.0.3-1.8.noarch.rpm"
RPM_HASH = "059331cded5f78cfe049e4a28b44c871414c61e3fbe755771ace08a8481b7b97be06969aa1829fc9673d75b7093f4dce3f1b1d89cc5ecadfc81f497eb989aa18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypubsub \
python3.10dist-pypubsub \
python310-pypubsub \
python3dist-pypubsub"

RDEPENDS:${PN} += "python-abi"

inherit rpm
