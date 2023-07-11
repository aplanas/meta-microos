SUMMARY = "Go from Docker Compose to Kubernetes"
DESCRIPTION = "kompose is a tool to help users who are familiar with docker-compose move to Kubernetes. kompose takes a Docker Compose file and translates it into Kubernetes resources. kompose is a convenience tool to go from local Docker development to managing your application with Kubernetes. Transformation of the Docker Compose format to Kubernetes resources manifest may not be exact, but it helps tremendously when first deploying an application on Kubernetes."
LICENSE = "Apache-2.0"

PV = "1.28.0"

RPM_NAME = "kompose-1.28.0-1.1.aarch64.rpm"
RPM_HASH = "ea42657df7d1d8137fe84c7f61b4c525112b78a4175c47051a6aa6f0cacbb914b30972088bda0c9cfa905e2fa6a71eb56fbaec8225d1193e2128d44492106176"

RPROVIDES:${PN} += "kompose"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
