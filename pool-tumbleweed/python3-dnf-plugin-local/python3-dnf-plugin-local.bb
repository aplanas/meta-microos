SUMMARY = "Local Plugin for DNF"
DESCRIPTION = "Local Plugin for DNF, Python 3 version. Automatically copy all downloaded \
packages to a repository on the local filesystem and generating repo metadata."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "python3-dnf-plugin-local-4.3.1-2.2.noarch.rpm"
RPM_HASH = "e5ec478cae3140e3f812920bd91efc81dd0509742617395ea32eb39ef5a7e6c40c1ea68ddb1a1f3e210d5b162d2f63af4d0b456acd1982701898c1f24530c228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-dnf-plugin-local \
dnf-plugin-local \
dnf-plugins-extras-local \
python3-dnf-plugin-local \
python3-dnf-plugins-extras-local"

RDEPENDS:${PN} += "createrepo-c \
python-abi \
python3-dnf-plugins-core"

inherit rpm
