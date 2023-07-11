SUMMARY = "Documentation for vagrant-sshfs"
DESCRIPTION = "This package contains the documentation for the SSHFS provider to Vagrant."
LICENSE = "GPL-2.0-only"

PV = "1.3.7"

RPM_NAME = "vagrant-sshfs-doc-1.3.7-3.5.noarch.rpm"
RPM_HASH = "be128fccf2028802a52c3921a36286f2949961cc1cd8fa88c541c8312d42b520fc5a8958cb5aa97f00ffdbb360805fd77eb448714484119c6678cf4b9b70b008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vagrant-sshfs-doc"

RDEPENDS:${PN} += ""

inherit rpm
