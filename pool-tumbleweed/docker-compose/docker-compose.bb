SUMMARY = "Define and run multi-container applications with Docker"
DESCRIPTION = "Docker Compose is a tool for running multi-container applications on Docker defined using the Compose file format. A Compose file is used to define how the one or more containers that make up your application are configured. Once you have a Compose file, you can create and start your application with a single command: docker compose up. \
About update and backward compatibility \
 \
Docker Compose V2 is a major version bump release of Docker Compose. It has been completely rewritten from scratch in Golang (V1 was in Python). The installation instructions for Compose V2 differ from V1. V2 is not a standalone binary anymore, and installation scripts will have to be adjusted. Some commands are different. \
 \
For a smooth transition from legacy docker-compose 1.xx, please consider installing compose-switch to translate docker-compose ... commands into Compose V2's docker compose .... . Also check V2's --compatibility flag."
LICENSE = "Apache-2.0"

PV = "2.18.1"

RPM_NAME = "docker-compose-2.18.1-1.1.aarch64.rpm"
RPM_HASH = "a9b60b57d02d2ab4db287cb3dec893f195431ba1fcf9d3365e162bb81e079f1c23b5ac38b68fc89626e04dc4d893856d3862a6715d7c3d2d458dfb3aa455e61d"

RPROVIDES:${PN} += "docker-compose \
docker-compose(aarch-64)"

RDEPENDS:${PN} += "docker \
docker-compose-switch \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
