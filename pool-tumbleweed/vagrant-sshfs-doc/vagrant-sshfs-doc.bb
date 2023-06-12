SUMMARY = "Documentation for vagrant-sshfs"
DESCRIPTION = "This package contains the documentation for the SSHFS provider to Vagrant."
LICENSE = "GPL-2.0-only"

PV = "1.3.7"

RPM_NAME = "vagrant-sshfs-doc-1.3.7-3.4.noarch.rpm"
RPM_HASH = "5d5668adf9db7056d329602688dbd422b66bd04e5a532c2dd7e825860797bc761194fb2658c60bdc74f88afdcf4181e7699e2f59b52074c471c82286d691ed7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vagrant-sshfs-doc"
RDEPENDS:${PN} += ""

inherit rpm
