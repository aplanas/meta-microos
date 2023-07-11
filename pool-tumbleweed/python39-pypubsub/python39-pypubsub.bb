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

RPM_NAME = "python39-pypubsub-4.0.3-1.10.noarch.rpm"
RPM_HASH = "c65ef1cf8b38562b5dbc41119391a973cc9d3d6cb6cb66a878c5bdf8a1a6df07c51d619ca7c9063c0687c6b2b77a304bb277647b032a69096353857f9a365802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pypubsub \
python39-pypubsub \
python3dist-pypubsub"

RDEPENDS:${PN} += "python-abi"

inherit rpm
