SUMMARY = "Utilities for system wide CA certificate installation"
DESCRIPTION = "Update-ca-certificates is intended to keep the certificate stores of \
SSL libraries like OpenSSL or GnuTLS in sync with the system's CA \
certificate store that is managed by p11-kit."
LICENSE = "GPL-2.0-or-later"

PV = "2+git20230406.2dae8b7"

RPM_NAME = "ca-certificates-2+git20230406.2dae8b7-1.2.noarch.rpm"
RPM_HASH = "5ce1e55285f18c926bd06ee1e5f1282608fa03e9a79b3344406feb311104beb0da9955700bb9175a8fd68cd08880f79d7447ec48d8501bc26f60558b2a71a221"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ca-certificates \
java-ca-certificates"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/readlink \
/usr/bin/sh \
p11-kit \
p11-kit-tools"

inherit rpm
