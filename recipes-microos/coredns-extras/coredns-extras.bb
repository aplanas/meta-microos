SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "coredns-extras-1.10.0-1.3.noarch.rpm"
RPM_HASH = "3411c2fbca0a009b8b805a3c1b9b9d0429fd36c07b54857f11edb34b9e1abd8b4558f13dcbb4a47a08d47c9d59752f0ca012993dbd0cd67f2b5663b44068b9b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(coredns-extras) coredns-extras"
RDEPENDS:${PN} += "/bin/sh coredns"

inherit rpm
