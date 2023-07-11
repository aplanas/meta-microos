SUMMARY = "Japanese documentation for lxc"
DESCRIPTION = "Japanese language man pages for lxc."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "lxc-ja-doc-5.0.2-1.2.noarch.rpm"
RPM_HASH = "3e84f3f8e3fb759177ff415fe136269e0fe537570888a0a042cf3532b56bd2bea5a8d9195993c6448119edfb2bbe88ee265da9f669252ef980bf2bb0e34e8288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxc-ja-doc"

RDEPENDS:${PN} += "lxc"

inherit rpm
