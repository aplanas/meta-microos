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

RPM_NAME = "jgroups-manual-2.6.10-33.10.noarch.rpm"
RPM_HASH = "f9558adb88abfd7c14bd3ecb7aa45efa584d30ff43a26aca9ff619ab20d115b820e64c2138c1de023aa6dd9c56e1e14c9213b045ffd18a62ca5a5dca2c914ebd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jgroups-manual"

RDEPENDS:${PN} += "jgroups"

inherit rpm
