SUMMARY = "Extensible Perl internet server"
DESCRIPTION = "'Net::Server' is an extensible, generic Perl server engine. \
 \
'Net::Server' attempts to be a generic server as in 'Net::Daemon' and \
'NetServer::Generic'. It includes with it the ability to run as an inetd \
process ('Net::Server::INET'), a single connection server ('Net::Server' or \
'Net::Server::Single'), a forking server ('Net::Server::Fork'), a \
preforking server which maintains a constant number of preforked children \
('Net::Server::PreForkSimple'), or as a managed preforking server which \
maintains the number of children based on server load \
('Net::Server::PreFork'). In all but the inetd type, the server provides \
the ability to connect to one or to multiple server ports. \
 \
The additional server types are made possible via 'personalities' or sub \
classes of the 'Net::Server'. By moving the multiple types of servers out \
of the main 'Net::Server' class, the 'Net::Server' concept is easily \
extended to other types (in the near future, we would like to add a \
'Thread' personality). \
 \
'Net::Server' borrows several concepts from the Apache Webserver. \
'Net::Server' uses 'hooks' to allow custom servers such as SMTP, HTTP, \
POP3, etc. to be layered over the base 'Net::Server' class. In addition the \
'Net::Server::PreFork' class borrows concepts of min_start_servers, \
max_servers, and min_waiting servers. 'Net::Server::PreFork' also uses the \
concept of an flock serialized accept when accepting on multiple ports \
(PreFork can choose between flock, IPC::Semaphore, and pipe to control \
serialization)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.014"

RPM_NAME = "perl-Net-Server-2.014-1.2.noarch.rpm"
RPM_HASH = "7a134dbdd138b5844461a1cb5fb25148e0fed94af9754fa8d41b65b00c3de4eda62adfbb9a39e4757e0efcbde943bbc2918c638dae8f5672bf787f8a433aa40b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Server \
perl-Net--Server--Daemonize \
perl-Net--Server--Fork \
perl-Net--Server--HTTP \
perl-Net--Server--INET \
perl-Net--Server--INET--Handle \
perl-Net--Server--Log--Log--Log4perl \
perl-Net--Server--Log--Sys--Syslog \
perl-Net--Server--MultiType \
perl-Net--Server--Multiplex \
perl-Net--Server--Multiplex--MUX \
perl-Net--Server--PSGI \
perl-Net--Server--PreFork \
perl-Net--Server--PreForkSimple \
perl-Net--Server--Proto \
perl-Net--Server--Proto--SSL \
perl-Net--Server--Proto--SSLEAY \
perl-Net--Server--Proto--TCP \
perl-Net--Server--Proto--UDP \
perl-Net--Server--Proto--UNIX \
perl-Net--Server--Proto--UNIXDGRAM \
perl-Net--Server--SIG \
perl-Net--Server--Single \
perl-Net--Server--Thread \
perl-Net--Server--TiedHandle \
perl-Net-Server"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
