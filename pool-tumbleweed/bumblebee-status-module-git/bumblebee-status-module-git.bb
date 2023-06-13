SUMMARY = "Widget to show git information"
DESCRIPTION = "Displays information about the git repository."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-git-2.1.5-3.3.noarch.rpm"
RPM_HASH = "1c0d72e2b286689942da8b46f7953aa44379ab0ca7b3516366c6549228564be8784789c1b50f244cc1010d1e2c93d10df53f85e6e4bc5e0cfb7e0735deeb9002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-git"

RDEPENDS:${PN} += "bumblebee-status \
python3-pygit2 \
xcwd"

inherit rpm
