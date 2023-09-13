SUMMARY = "Define and run multi-container applications with Docker"
DESCRIPTION = "Docker Compose is a tool for running multi-container applications on Docker defined using the Compose file format. A Compose file is used to define how the one or more containers that make up your application are configured. Once you have a Compose file, you can create and start your application with a single command: docker compose up. \
About update and backward compatibility \
 \
Docker Compose V2 is a major version bump release of Docker Compose. It has been completely rewritten from scratch in Golang (V1 was in Python). The installation instructions for Compose V2 differ from V1. V2 is not a standalone binary anymore, and installation scripts will have to be adjusted. Some commands are different. \
 \
For a smooth transition from legacy docker-compose 1.xx, please consider installing compose-switch to translate docker-compose ... commands into Compose V2's docker compose .... . Also check V2's --compatibility flag."
LICENSE = "Apache-2.0"

PV = "2.21.0"

RPM_NAME = "docker-compose-2.21.0-1.1.aarch64.rpm"
RPM_HASH = "84f755cce41830046d3b3711c29f77fab7e295954a1d4e58402f0411e9dfde4034da3d2e4ac02295c944fa4df6681fddaf5580169eeea5dfaa7cc1288eb84448"

RPROVIDES:${PN} += "docker-compose"

RDEPENDS:${PN} += "docker \
docker-compose-switch \
libc.so.6"

inherit rpm
