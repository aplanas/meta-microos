SUMMARY = "Develop your applications directly in your Kubernetes Cluster"
DESCRIPTION = "Kubernetes has made it very easy to deploy applications to the cloud at a higher scale than ever, but the development practices have not evolved at the same speed as application deployment patterns. \
Today, most developers try to either run parts of the infrastructure locally or just test these integrations directly in the cluster via CI jobs, or the docker build/redeploy cycle. It works, but this workflow is painful and incredibly slow. \
okteto accelerates the development workflow of Kubernetes applications. You write your code locally and okteto detects the changes and instantly updates your Kubernetes applications."
LICENSE = "Apache-2.0"

PV = "2.18.2"

RPM_NAME = "okteto-2.18.2-1.1.aarch64.rpm"
RPM_HASH = "9babef40320fe09a49b5d2613bf0d6bf1483d383a7aa203450c8846e75ae06db0793cb3d5e0d503d0b8b984b893da09ec3d031040bad091c5232928d2b81ff0c"

RPROVIDES:${PN} += "okteto"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
