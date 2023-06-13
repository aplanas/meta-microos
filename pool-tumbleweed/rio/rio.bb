SUMMARY = "Application Deployment Engine for Kubernetes"
DESCRIPTION = "Rio is an Application Deployment Engine for Kubernetes that can be layered on top of any standard Kubernetes cluster. Consisting of a few Kubernetes custom resources and a CLI to enhance the user experience, users can easily deploy services to Kubernetes and automatically get continuous delivery, DNS, HTTPS, routing, monitoring, autoscaling, canary deployments, git-triggered builds, and much more. All it takes to get going is an existing Kubernetes cluster and the rio CLI."
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "rio-0.8.0-1.9.aarch64.rpm"
RPM_HASH = "1bfdf12568e65c7ae44d8ee292c44cb3e680766318e5c1ba70ae38c4ae97fd228d5d0d000dd501a7531bfcfbb5ebbe8145c2735d2852e2f32714a4449c4e066e"

RPROVIDES:${PN} += "rio \
rio(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
