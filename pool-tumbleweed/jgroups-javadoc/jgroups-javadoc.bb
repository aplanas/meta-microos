SUMMARY = "Javadoc for jgroups"
DESCRIPTION = "JGroups is a toolkit for reliable multicast communication. (Note that \
this doesn't necessarily mean IP Multicast, JGroups can also use \
transports such as TCP). It can be used to create groups of processes \
whose members can send messages to each other. The main features include \
 \
    * Group creation and deletion. Group members can be spread across \
      LANs or WANs \
    * Joining and leaving of groups \
    * Membership detection and notification about joined/left/crashed members \
    * Detection and removal of crashed members \
    * Sending and receiving of member-to-group messages (point-to-multipoint) \
    * Sending and receiving of member-to-member messages (point-to-point)"
LICENSE = "LGPL-2.0-or-later"

PV = "2.6.10"

RPM_NAME = "jgroups-javadoc-2.6.10-33.10.noarch.rpm"
RPM_HASH = "94cfbecbb7a7de9eb4667917cbcdac1ef5f45ffb0de52088349c458a7c3d03c42520619d5bfbc69d6295287ebd25fecf83ff30b55390e75b8da1cd948d351288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jgroups-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
