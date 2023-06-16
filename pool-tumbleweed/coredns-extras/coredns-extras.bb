SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "coredns-extras-1.10.0-1.4.noarch.rpm"
RPM_HASH = "7d98e3bc36668aa60b2c4206e55441d5a36886b87fecaf5964b04ef2ec1bcfcae5891571b25d1f615c69c422e1ba09e37f01bf42ad1b50acda1923201c5a3a10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-coredns-extras \
coredns-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
coredns"

inherit rpm
