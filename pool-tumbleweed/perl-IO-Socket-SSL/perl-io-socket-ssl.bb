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

RPM_NAME = "perl-IO-Socket-SSL-2.083-1.1.noarch.rpm"
RPM_HASH = "d3d4276b70f6fbc3fb1e383c8f5e00ba4850aafe16a0f99380e766b3bef1e12c0c70aba3700f7b59c111fe61358a147b68e95c350dedb58a2bc361c2f12df8fa"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Net--SSLeay"

inherit rpm
