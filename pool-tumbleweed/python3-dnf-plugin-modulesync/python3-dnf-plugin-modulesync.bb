SUMMARY = "Download module metadata and packages and create repository"
DESCRIPTION = "Download module metadata from all enabled repositories, module artifacts, \
and profiles of matching modules and create repository."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "python3-dnf-plugin-modulesync-4.3.1-2.1.noarch.rpm"
RPM_HASH = "e3814b4b782e66eae73daa587bd06ace06b3716c6304faa5673941fbdd6b5eee0cdd7e027644cef245fc729f7230861211a92eeb6d12e400a4468ca11a0d70ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-command(modulesync) \
dnf-plugin-modulesync \
python3-dnf-plugin-modulesync"

RDEPENDS:${PN} += "createrepo_c \
python(abi) \
python3-dnf-plugins-core"

inherit rpm
