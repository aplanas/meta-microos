SUMMARY = "Advanced Message Queue Protocol (de)serialization and representation"
DESCRIPTION = "This module implements the frame (de)serialization and representation of \
the Advanced Message Queue Protocol (http://www.amqp.org/). It is to be \
used in conjunction with client or server software that does the actual \
TCP/IP communication."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.06"

RPM_NAME = "perl-Net-AMQP-0.06-1.21.noarch.rpm"
RPM_HASH = "fe32de66d13187cd5f7e126621f44094594054b57cd4b93f2bbaf5f7d7c138309e815dc2fbd8c9fef6cbc367c964bf7cebaf692162604f6b41b813a38fb2bd0d"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Accessor \
perl-Class--Data--Inheritable \
perl-XML--LibXML"

inherit rpm
