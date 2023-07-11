SUMMARY = "Emit fedmsg messages from mailman3"
DESCRIPTION = "Emit fedmsg messages from mailman3."
LICENSE = "LGPL-2.0-only"

PV = "0.5"

RPM_NAME = "python311-mailman3-fedmsg-plugin-0.5-1.15.noarch.rpm"
RPM_HASH = "d52679fe11556d8f6b2a291d208fa08623e8b0d7ee2a341da159c7ce782a999caeed0e709a495094a19deb93c8bac0dac92986d5995962661ac1a089e14986f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mailman3-fedmsg-plugin \
python3.11dist-mailman3-fedmsg-plugin \
python311-mailman3-fedmsg-plugin \
python3dist-mailman3-fedmsg-plugin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
