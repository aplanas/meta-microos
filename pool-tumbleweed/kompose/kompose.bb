SUMMARY = "Go from Docker Compose to Kubernetes"
DESCRIPTION = "kompose is a tool to help users who are familiar with docker-compose move to Kubernetes. kompose takes a Docker Compose file and translates it into Kubernetes resources. kompose is a convenience tool to go from local Docker development to managing your application with Kubernetes. Transformation of the Docker Compose format to Kubernetes resources manifest may not be exact, but it helps tremendously when first deploying an application on Kubernetes."
LICENSE = "Apache-2.0"

PV = "1.26.1"

RPM_NAME = "kompose-1.26.1-1.9.aarch64.rpm"
RPM_HASH = "424b94465eef3cab04fa043a2bb526db4edb61e8976e487f22fafc4fb5b9f87ba3e78dd04e21f4535459fa10d07e78cf65983b2fbeae86606f59aef9a0549b53"

RPROVIDES:${PN} += "kompose \
kompose(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
