SUMMARY = "Faster way to switch between clusters and namespaces in kubectl"
DESCRIPTION = "kubens is a utility to switch between Kubernetes namespaces. \
 \
USAGE: \
  kubens                    : list the namespaces \
  kubens <NAME>             : change the active namespace \
  kubens -                  : switch to the previous namespace \
  kubens -c, --current      : show the current namespace"
LICENSE = "Apache-2.0"

PV = "0.9.4"

RPM_NAME = "kubens-0.9.4-1.5.noarch.rpm"
RPM_HASH = "e602802d44b38995b558fa5b4e99a9be03778d237b5a207206b2973f5ee64b88e6e687f48c38a8f92d2978eb32829bad88b1965ed12e94e81676241bc9af63bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubens"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
