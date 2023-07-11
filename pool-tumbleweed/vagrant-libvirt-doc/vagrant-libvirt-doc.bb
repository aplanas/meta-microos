SUMMARY = "Documentation for vagrant-libvirt"
DESCRIPTION = "This package contains the documentation for the Libvirt provider to Vagrant."
LICENSE = "MIT"

PV = "0.11.2"

RPM_NAME = "vagrant-libvirt-doc-0.11.2-2.3.aarch64.rpm"
RPM_HASH = "aaa2697857b77363bfedba6925fb63743735d6d0c3f5f1e4468bfe160efcb207b58d9262e62786f905f8c55c379d587a03663b125ce28da23978f85318d493c4"

RPROVIDES:${PN} += "vagrant-libvirt-doc"

RDEPENDS:${PN} += ""

inherit rpm
