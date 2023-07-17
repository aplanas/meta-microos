SUMMARY = "Fish Completion for flux2-cli"
DESCRIPTION = "Fish command line completion support for flux2-cli."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "flux2-cli-fish-completion-2.0.1-1.1.noarch.rpm"
RPM_HASH = "d418167fff386c1c3f80b4e3e4f3dfe46c2f72f307f677537fe2462b2989ef9aa178267b1fc8c4ccb71f4ff69f2656abeadbf8f0caecc44639844a821b120010"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flux2-cli-fish-completion"

RDEPENDS:${PN} += "flux2-cli"

inherit rpm
