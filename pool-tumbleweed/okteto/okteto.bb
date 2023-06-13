SUMMARY = "Develop your applications directly in your Kubernetes Cluster"
DESCRIPTION = "Kubernetes has made it very easy to deploy applications to the cloud at a higher scale than ever, but the development practices have not evolved at the same speed as application deployment patterns. \
Today, most developers try to either run parts of the infrastructure locally or just test these integrations directly in the cluster via CI jobs, or the docker build/redeploy cycle. It works, but this workflow is painful and incredibly slow. \
okteto accelerates the development workflow of Kubernetes applications. You write your code locally and okteto detects the changes and instantly updates your Kubernetes applications."
LICENSE = "Apache-2.0"

PV = "2.16.2"

RPM_NAME = "okteto-2.16.2-1.1.aarch64.rpm"
RPM_HASH = "466bf45f24817b134776bc2b54bf466e2017604f72b812ccbf5acc823226247980e386032b576f8f924a374bbc6915818ee11fcb3a17f02c97e0086f82526818"

RPROVIDES:${PN} += "okteto \
okteto(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
