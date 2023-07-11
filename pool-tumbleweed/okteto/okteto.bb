SUMMARY = "Develop your applications directly in your Kubernetes Cluster"
DESCRIPTION = "Kubernetes has made it very easy to deploy applications to the cloud at a higher scale than ever, but the development practices have not evolved at the same speed as application deployment patterns. \
Today, most developers try to either run parts of the infrastructure locally or just test these integrations directly in the cluster via CI jobs, or the docker build/redeploy cycle. It works, but this workflow is painful and incredibly slow. \
okteto accelerates the development workflow of Kubernetes applications. You write your code locally and okteto detects the changes and instantly updates your Kubernetes applications."
LICENSE = "Apache-2.0"

PV = "2.17.0"

RPM_NAME = "okteto-2.17.0-1.1.aarch64.rpm"
RPM_HASH = "777a2e555b05769f9b5cd89f0e5ec10e4cad7823875e94e5bd2d5dc674952324c57fdc3b3849d87e67a17b78117e160a798ec4fbdcc97f80b8698e1c77babd73"

RPROVIDES:${PN} += "okteto"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
