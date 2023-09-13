SUMMARY = "Develop your applications directly in your Kubernetes Cluster"
DESCRIPTION = "Kubernetes has made it very easy to deploy applications to the cloud at a higher scale than ever, but the development practices have not evolved at the same speed as application deployment patterns. \
Today, most developers try to either run parts of the infrastructure locally or just test these integrations directly in the cluster via CI jobs, or the docker build/redeploy cycle. It works, but this workflow is painful and incredibly slow. \
okteto accelerates the development workflow of Kubernetes applications. You write your code locally and okteto detects the changes and instantly updates your Kubernetes applications."
LICENSE = "Apache-2.0"

PV = "2.19.2"

RPM_NAME = "okteto-2.19.2-1.1.aarch64.rpm"
RPM_HASH = "ca2855d1ef568bbc1e877105d12fbd365d9638cd9736f5f51438ae1b56b193bfe58a87b3a019c88ecdcd7991d938b409ebbbd90027bfe9f5b0a88c22cb59820a"

RPROVIDES:${PN} += "okteto"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
