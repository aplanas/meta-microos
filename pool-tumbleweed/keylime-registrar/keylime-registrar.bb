SUMMARY = "Keylime registrar service"
DESCRIPTION = "Subpackage of keylime for registrar service."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.4.0"

RPM_NAME = "keylime-registrar-7.4.0-1.1.noarch.rpm"
RPM_HASH = "898fc1ced1db6d6bdae06eed132121a21976f08e6531277821c122a78b0241db46501c5b8001d8889e56692845b99bd7d93f972b6754974d2adcb9d3ecd9a386"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-registrar"

RDEPENDS:${PN} += "/usr/bin/sh \
keylime-config \
keylime-logrotate \
keylime-tpm-cert-store \
python3-keylime"

inherit rpm
