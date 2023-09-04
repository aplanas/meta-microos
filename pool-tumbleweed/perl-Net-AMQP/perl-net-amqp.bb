SUMMARY = "Advanced Message Queue Protocol (de)serialization and representation"
DESCRIPTION = "This module implements the frame (de)serialization and representation of \
the Advanced Message Queue Protocol (http://www.amqp.org/). It is to be \
used in conjunction with client or server software that does the actual \
TCP/IP communication."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.06"

RPM_NAME = "perl-Net-AMQP-0.06-1.22.noarch.rpm"
RPM_HASH = "92a5f4bf97f2b442038536fba2af00bf1b0dacb17fa20053f0bcd56b57e0ac54bf574a66260796660b8bec20f70977130eb7791706beb7ed0dc8b64bd753a703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--AMQP \
perl-Net--AMQP--Common \
perl-Net--AMQP--Frame \
perl-Net--AMQP--Frame--Body \
perl-Net--AMQP--Frame--Header \
perl-Net--AMQP--Frame--Heartbeat \
perl-Net--AMQP--Frame--Method \
perl-Net--AMQP--Frame--OOBBody \
perl-Net--AMQP--Frame--OOBHeader \
perl-Net--AMQP--Frame--OOBMethod \
perl-Net--AMQP--Frame--Trace \
perl-Net--AMQP--Protocol \
perl-Net--AMQP--Protocol--Base \
perl-Net--AMQP--Protocol--v0-8 \
perl-Net--AMQP--Value \
perl-Net--AMQP--Value--Boolean \
perl-Net--AMQP--Value--Integer \
perl-Net--AMQP--Value--String \
perl-Net--AMQP--Value--Timestamp \
perl-Net-AMQP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Accessor \
perl-Class--Data--Inheritable \
perl-XML--LibXML"

inherit rpm
