SUMMARY = "Faster way to switch between clusters and namespaces in kubectl"
DESCRIPTION = "kubens is a utility to switch between Kubernetes namespaces. \
 \
USAGE: \
  kubens                    : list the namespaces \
  kubens <NAME>             : change the active namespace \
  kubens -                  : switch to the previous namespace \
  kubens -c, --current      : show the current namespace"
LICENSE = "Apache-2.0"

PV = "0.9.5"

RPM_NAME = "kubens-0.9.5-1.1.noarch.rpm"
RPM_HASH = "38f828d9dd854b4eaaa654b82829507e2eda07d5717efa0689e479d1842d68ef29947b71bef5379d75e32fea785c3238617b21ad1676e1d2159572858b3e4776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubens"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
