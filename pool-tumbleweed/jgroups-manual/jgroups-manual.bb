SUMMARY = "Manual for jgroups"
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

RPM_NAME = "jgroups-manual-2.6.10-33.9.noarch.rpm"
RPM_HASH = "b31da1ea0ed604b91dbce963f8faece8b5892bf32dc075538ff2ce0966b2f3e9294bebc792766d2401e38db1cf73000edad593c6a4fe1ae77f89162246c89d6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jgroups-manual"
RDEPENDS:${PN} += "jgroups"

inherit rpm
