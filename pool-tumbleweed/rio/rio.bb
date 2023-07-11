SUMMARY = "Application Deployment Engine for Kubernetes"
DESCRIPTION = "Rio is an Application Deployment Engine for Kubernetes that can be layered on top of any standard Kubernetes cluster. Consisting of a few Kubernetes custom resources and a CLI to enhance the user experience, users can easily deploy services to Kubernetes and automatically get continuous delivery, DNS, HTTPS, routing, monitoring, autoscaling, canary deployments, git-triggered builds, and much more. All it takes to get going is an existing Kubernetes cluster and the rio CLI."
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "rio-0.8.0-1.10.aarch64.rpm"
RPM_HASH = "aed9ffc083c039b86abbac9cdf0a01c28c767bb4527c3651bd00ace494b498221b494d29a92518da9dffd584555c849a0444596fadfee1ab0288a103eac28ad1"

RPROVIDES:${PN} += "rio"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
