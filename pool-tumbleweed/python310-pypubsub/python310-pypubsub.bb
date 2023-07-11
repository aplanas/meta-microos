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

RPM_NAME = "python310-pypubsub-4.0.3-1.10.noarch.rpm"
RPM_HASH = "45c02d21b00ddd834fc9e2334783db2fefb7fce291a8a90d975ca9348c7b68cb5c25beea477ac45e56f5a0fd643eed4e10e6b1c4757446f61c44845f9a75a806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pypubsub \
python310-pypubsub \
python3dist-pypubsub"

RDEPENDS:${PN} += "python-abi"

inherit rpm
