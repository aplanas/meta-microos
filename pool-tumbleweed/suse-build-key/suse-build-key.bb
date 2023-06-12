SUMMARY = "The public gpg key for rpm package signature verification"
DESCRIPTION = "This package contains the gpg keys that are used to sign the \
SUSE rpm packages. The keys installed here are not actually \
used by anything. rpm/zypper use the keys in the rpm db instead."
LICENSE = "GPL-2.0-or-later"

PV = "12.0"

RPM_NAME = "suse-build-key-12.0-11.1.noarch.rpm"
RPM_HASH = "82b40175a1fdf8c7b6077c543aeaee3def082d0b4e0433a74b15f547db370013630807154679f0f0772574f1c032971947fbf52b308a14c478c33cb8b57a2220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-key \
suse-build-key"
RDEPENDS:${PN} += "fileutils \
gpg \
mktemp \
sh-utils"

inherit rpm
