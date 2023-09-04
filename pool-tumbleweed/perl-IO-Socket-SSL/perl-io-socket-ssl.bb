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

RPM_NAME = "perl-IO-Socket-SSL-2.083-1.3.noarch.rpm"
RPM_HASH = "1901409cfde91067c7b4afe8a890d3db1c669dc6b0ca778f20f1e982ce9b2c5451dae7d7104a97affc92ec2eafece6fe32b84a6192ca0a0d571014764f634731"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Net--SSLeay"

inherit rpm
