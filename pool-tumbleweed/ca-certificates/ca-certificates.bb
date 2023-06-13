SUMMARY = "Utilities for system wide CA certificate installation"
DESCRIPTION = "Update-ca-certificates is intended to keep the certificate stores of \
SSL libraries like OpenSSL or GnuTLS in sync with the system's CA \
certificate store that is managed by p11-kit."
LICENSE = "GPL-2.0-or-later"

PV = "2+git20230406.2dae8b7"

RPM_NAME = "ca-certificates-2+git20230406.2dae8b7-1.1.noarch.rpm"
RPM_HASH = "9da71c3c070216080db72a26c152a4092b34ee2be4a354b63a2e89815ce97a6a6f9bfe55e26779957ec2e0a88680b160abf4b65a0721baf26719a90a4342c90a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ca-certificates \
java-ca-certificates"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/readlink \
p11-kit \
p11-kit-tools"

inherit rpm
