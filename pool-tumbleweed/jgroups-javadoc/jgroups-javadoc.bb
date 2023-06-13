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

RPM_NAME = "jgroups-javadoc-2.6.10-33.9.noarch.rpm"
RPM_HASH = "6be19bcfffa4fcb92df66c8140f6b188974d3b4dced7634b8efb2c6e263cfa99cb5e3af985fc02ef0550f05b0e5a8ec04c333f1c5a1baa01832395ce64e74067"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jgroups-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
