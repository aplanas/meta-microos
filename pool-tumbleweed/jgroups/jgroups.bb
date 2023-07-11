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

RPM_NAME = "jgroups-2.6.10-33.10.noarch.rpm"
RPM_HASH = "971f91b804db44bdea9878a3348e7d02a00aec806dcbce3a8b2229c2a8fc88e6246136462365a37cfe91296a377e60d15da4fefce7a42e12cc9b0a13cd90050c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javagroups \
jgroups"

RDEPENDS:${PN} += "apache-commons-logging \
bsh2 \
geronimo-jms-1-1-api \
jaxp-parser-impl \
reload4j"

inherit rpm
