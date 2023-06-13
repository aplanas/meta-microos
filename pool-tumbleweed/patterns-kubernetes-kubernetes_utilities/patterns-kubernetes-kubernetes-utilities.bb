SUMMARY = "Utilities to manage kubernetes"
DESCRIPTION = "This pattern installs utilities helpful to manage kubernetes."
LICENSE = "MIT"

PV = "5.1"

RPM_NAME = "patterns-kubernetes-kubernetes_utilities-5.1-2.1.aarch64.rpm"
RPM_HASH = "070c8d69c9db1f26a47c502df6785a86cbf33b7a49e254e32c2f36b39c820f4575104d98220dfa6e4dda99e7c45cb5c75d2bf8e682d5b49990b91265f595e40c"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-containers-kubernetes-utilities \
patterns-kubernetes-kubernetes_utilities \
patterns-kubernetes-kubernetes_utilities(aarch-64)"

RDEPENDS:${PN} += "helm \
k9s \
kail \
kubectl-who-can \
pattern() \
rakkess \
rbac-lookup \
reg"

inherit rpm
