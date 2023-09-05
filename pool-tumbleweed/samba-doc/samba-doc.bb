SUMMARY = "Samba Documentation"
DESCRIPTION = "This package contains all the Samba documentation as it is not part of \
the man pages."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.6+git.320.cfda27bacb"

RPM_NAME = "samba-doc-4.18.6+git.320.cfda27bacb-1.1.noarch.rpm"
RPM_HASH = "11f25bd8c9ccb56db9dac41cd9659b6b328a69449c6f57eb7eb459d18da185e5b03d5694b6c173dbd1b24bf45356b834f00a8b9f39f27bccd80657d894e21f5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "samba-doc"

RDEPENDS:${PN} += "coreutils \
findutils"

inherit rpm
