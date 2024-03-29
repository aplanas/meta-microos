SUMMARY = "High-performance preforking PSGI/Plack web server"
DESCRIPTION = "Starman is a PSGI perl web server that has unique features such as: \
 \
* High Performance \
 \
Uses the fast XS/C HTTP header parser \
 \
* Preforking \
 \
Spawns workers preforked like most high performance UNIX servers do. \
Starman also reaps dead children and automatically restarts the worker \
pool. \
 \
* Signals \
 \
Supports 'HUP' for graceful worker restarts, and 'TTIN'/'TTOU' to \
dynamically increase or decrease the number of worker processes, as well as \
'QUIT' to gracefully shutdown the worker processes. \
 \
* Superdaemon aware \
 \
Supports Server::Starter for hot deploy and graceful restarts. \
 \
* Multiple interfaces and UNIX Domain Socket support \
 \
Able to listen on multiple interfaces including UNIX sockets. \
 \
* Small memory footprint \
 \
Preloading the applications with '--preload-app' command line option \
enables copy-on-write friendly memory management. Also, the minimum memory \
usage Starman requires for the master process is 7MB and children (workers) \
is less than 3.0MB. \
 \
* PSGI compatible \
 \
Can run any PSGI applications and frameworks \
 \
* HTTP/1.1 support \
 \
Supports chunked requests and responses, keep-alive and pipeline requests. \
 \
* UNIX only \
 \
This server does not support Win32."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.4016"

RPM_NAME = "perl-Starman-0.4016-1.4.noarch.rpm"
RPM_HASH = "fe28798868c2b5f27cbcda86d8b4014370832641e3e2f28cb56b2abde0b5ae453d695b37fdfeaaad5dca590ab9015df3552a318f637cef0bbc49171b9f2e775a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Server--PSGI--Net--Server--PreFork \
perl-Plack--Handler--Starman \
perl-Starman \
perl-Starman--Server"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Data--Dump \
perl-HTTP--Date \
perl-HTTP--Parser--XS \
perl-HTTP--Status \
perl-Net--Server \
perl-Plack \
perl-Test--TCP \
perl-parent"

inherit rpm
