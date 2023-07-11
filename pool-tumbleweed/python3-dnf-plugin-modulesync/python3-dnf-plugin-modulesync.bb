SUMMARY = "Download module metadata and packages and create repository"
DESCRIPTION = "Download module metadata from all enabled repositories, module artifacts, \
and profiles of matching modules and create repository."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "python3-dnf-plugin-modulesync-4.3.1-2.2.noarch.rpm"
RPM_HASH = "b01f44794935e74ab4a36d03c0667eb69cba3ee83b08ffb7385179e52539e97136698ebcd20f124677bcc43424c3baed14cc274ff3156feed26812eeb9bff51b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-command-modulesync \
dnf-plugin-modulesync \
python3-dnf-plugin-modulesync"

RDEPENDS:${PN} += "createrepo-c \
python-abi \
python3-dnf-plugins-core"

inherit rpm
