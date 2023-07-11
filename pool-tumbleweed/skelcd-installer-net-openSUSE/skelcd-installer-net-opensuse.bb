SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "skelcd-installer-net-openSUSE-17.89-1.31.aarch64.rpm"
RPM_HASH = "976b9f5d2711bfc3848460e3d2044f7ed13af7341bd4ed674e17cde333412b6203b90ee08e1b1fd7420e69c58fbdabf38fde539802f3f4a660416eece7115c75"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
