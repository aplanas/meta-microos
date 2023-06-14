SUMMARY = "VCS-based management of project version strings [toml] extra"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree. \
 \
This package provides the [toml] extra"
LICENSE = "Unlicense"

PV = "0.28"

RPM_NAME = "python311-versioneer-toml-0.28-1.1.noarch.rpm"
RPM_HASH = "3dea8eff6fe4ef2e853d330e564c7c15257d03fc379822563ddf9d2949fac961e4a6943fbf093deb330d983d74dec7be222d4ee8e664ca05c901f315cee52183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-versioneer-toml"

RDEPENDS:${PN} += "python311-versioneer"

inherit rpm
