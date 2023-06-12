SUMMARY = "The public gpg keys for rpm package signature verification"
DESCRIPTION = "This package contains the gpg keys that are used to sign the \
openSUSE rpm packages. The keys installed here are not actually \
used by anything. rpm/zypper use the keys in the rpm db instead."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "openSUSE-build-key-1.0-48.1.aarch64.rpm"
RPM_HASH = "d58b4f28fff2788eb24bdcf411c6e60ce3d7c8c366bbb463130dc60bc825da6b3f24e005dbe20a887d1af19960f02734a4e3beeaaaea7c5fb0d6c9fe779777d5"

RPROVIDES:${PN} += "build-key \
openSUSE-build-key \
openSUSE-build-key(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
