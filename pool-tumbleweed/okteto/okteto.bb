SUMMARY = "Develop your applications directly in your Kubernetes Cluster"
DESCRIPTION = "Kubernetes has made it very easy to deploy applications to the cloud at a higher scale than ever, but the development practices have not evolved at the same speed as application deployment patterns. \
Today, most developers try to either run parts of the infrastructure locally or just test these integrations directly in the cluster via CI jobs, or the docker build/redeploy cycle. It works, but this workflow is painful and incredibly slow. \
okteto accelerates the development workflow of Kubernetes applications. You write your code locally and okteto detects the changes and instantly updates your Kubernetes applications."
LICENSE = "Apache-2.0"

PV = "2.18.0"

RPM_NAME = "okteto-2.18.0-1.1.aarch64.rpm"
RPM_HASH = "90802ec27005c81fc6994f298e59f84a45a1ffd51763b25b5383aa989f76da2b1e8fe8fbed88726032076a4702ccc10e9dcd91c192da8450bfcd51c17ef79804"

RPROVIDES:${PN} += "okteto"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
