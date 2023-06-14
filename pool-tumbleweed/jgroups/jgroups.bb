SUMMARY = "Toolkit for reliable multicast communication"
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
    * Sending and receiving of member-to-member messages (point-to-point) \
 \
To use JGroups one needs: \
 commons-logging.jar \
 log4j.jar \
 \
To run JGroups you need to have an XML parser installed on your system. \
If you use JDK 1.4 or higher, you can use the parser that is shipped with it. \
 \
If you want to use the JGroups JMS protocol ( org.jgroups.protocols.JMS ), \
then you will also need to place jms.jar somewhere in your CLASSPATH. \
 \
Place the JAR files somewhere in your CLASSPATH , and you're ready to start \
using JGroups."
LICENSE = "LGPL-2.0-or-later"

PV = "2.6.10"

RPM_NAME = "jgroups-2.6.10-33.9.noarch.rpm"
RPM_HASH = "a91416183accf73431677ae4206f9a98fbf06fb741cece735b86af447dc315ea03917bbcb3ce796d53e8456a81d499a82ab1324d8561a847ffb13158de2bd9fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javagroups \
jgroups"

RDEPENDS:${PN} += "apache-commons-logging \
bsh2 \
geronimo-jms-1-1-api \
jaxp-parser-impl \
reload4j"

inherit rpm
