SUMMARY = "Faster way to switch between clusters and namespaces in kubectl"
DESCRIPTION = "kubectx is a utility to manage and switch between kubectl(1) contexts."
LICENSE = "Apache-2.0"

PV = "0.9.4"

RPM_NAME = "kubectx-0.9.4-1.5.noarch.rpm"
RPM_HASH = "86dff459a3da39f03f937db6ef54eaa4c04bfe1dd4f0bacaa5423ede2b8c7c54ac426f9b82add7330eab84dffd4788340eeed5eaf21e7fc3844424cdb2b9d9a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectx"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
