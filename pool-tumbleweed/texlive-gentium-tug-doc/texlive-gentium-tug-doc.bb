SUMMARY = "Documentation for texlive-gentium-tug"
DESCRIPTION = "This package includes the documentation for texlive-gentium-tug"
LICENSE = "OFL-1.1"

PV = "2023.209.1.102svn63470"

RPM_NAME = "texlive-gentium-tug-doc-2023.209.1.102svn63470-53.1.noarch.rpm"
RPM_HASH = "f93b6a6670473ab3534720bde7195e7f17b2ebec8324dde13e406ca3cb8157b6fca7aa65fd1fe8f41e229d06b5063eebaddd5a88a810a650bf5ef06f236f454f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gentium-tug-doc"

RDEPENDS:${PN} += "/usr/bin/python"

inherit rpm
