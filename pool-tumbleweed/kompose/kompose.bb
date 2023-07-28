SUMMARY = "Go from Docker Compose to Kubernetes"
DESCRIPTION = "kompose is a tool to help users who are familiar with docker-compose move to Kubernetes. kompose takes a Docker Compose file and translates it into Kubernetes resources. kompose is a convenience tool to go from local Docker development to managing your application with Kubernetes. Transformation of the Docker Compose format to Kubernetes resources manifest may not be exact, but it helps tremendously when first deploying an application on Kubernetes."
LICENSE = "Apache-2.0"

PV = "1.30.0"

RPM_NAME = "kompose-1.30.0-1.1.aarch64.rpm"
RPM_HASH = "394a26097b157241dd09b1a76e9c53bc2296f41a62f9eca2e9520cc1aff5932f051742837b31e466e0c8196caba3bc446dfe120fd144622d373aa07431d3cec4"

RPROVIDES:${PN} += "kompose"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
