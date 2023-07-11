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

RPM_NAME = "python311-pypubsub-4.0.3-1.10.noarch.rpm"
RPM_HASH = "9287b1a4d0c05f1cd92efa12c12e7a0271308125a027cda42a90ea9d498a326896c41164250191919efaa38f7b9bb8dfb96ee0ba4a6224f0656261a5b0427094"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypubsub \
python3.11dist-pypubsub \
python311-pypubsub \
python3dist-pypubsub"

RDEPENDS:${PN} += "python-abi"

inherit rpm
