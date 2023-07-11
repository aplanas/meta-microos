SUMMARY = "Nearly transparent SSL encapsulation for IO::Socket::INET"
DESCRIPTION = "IO::Socket::SSL makes using SSL/TLS much easier by wrapping the necessary \
functionality into the familiar IO::Socket interface and providing secure \
defaults whenever possible. This way, existing applications can be made \
SSL-aware without much effort, at least if you do blocking I/O and don't \
use select or poll. \
 \
But, under the hood, SSL is a complex beast. So there are lots of methods \
to make it do what you need if the default behavior is not adequate. \
Because it is easy to inadvertently introduce critical security bugs or \
just hard to debug problems, I would recommend studying the following \
documentation carefully. \
 \
The documentation consists of the following parts: \
 \
* * 'Essential Information About SSL/TLS' \
 \
* * 'Basic SSL Client' \
 \
* * 'Basic SSL Server' \
 \
* * 'Common Usage Errors' \
 \
* * 'Common Problems with SSL' \
 \
* * 'Using Non-Blocking Sockets' \
 \
* * 'Advanced Usage' \
 \
* * 'Integration Into Own Modules' \
 \
* * 'Description Of Methods' \
 \
Additional documentation can be found in \
 \
* * IO::Socket::SSL::Intercept - Doing Man-In-The-Middle with SSL \
 \
* * IO::Socket::SSL::Utils - Useful functions for certificates etc"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.083"

RPM_NAME = "perl-IO-Socket-SSL-2.083-1.2.noarch.rpm"
RPM_HASH = "03dd18e2a70f08037dc9f19df0cd0d56b163032a9e9bc559569150d246b6b15abef3d2b3b6b1cd1eb7e661c3f6bee5cbb542eb5133ae70cc7eddea63ea289882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Socket--SSL \
perl-IO--Socket--SSL--Intercept \
perl-IO--Socket--SSL--OCSP-Cache \
perl-IO--Socket--SSL--OCSP-Resolver \
perl-IO--Socket--SSL--PublicSuffix \
perl-IO--Socket--SSL--SSL-Context \
perl-IO--Socket--SSL--SSL-HANDLE \
perl-IO--Socket--SSL--Session-Cache \
perl-IO--Socket--SSL--Trace \
perl-IO--Socket--SSL--Utils \
perl-IO-Socket-SSL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Net--SSLeay"

inherit rpm
