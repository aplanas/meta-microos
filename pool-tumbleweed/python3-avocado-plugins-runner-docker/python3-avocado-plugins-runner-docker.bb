SUMMARY = "Avocado Runner for Execution on Docker Containers"
DESCRIPTION = "This plugin allows Avocado to run jobs within a Docker container, by \
interacting with a Docker daemon and attaching to the container itself. Avocado \
must have been previously installed in the container."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-runner-docker-69.0-6.11.noarch.rpm"
RPM_HASH = "657046d14d9a553d9c3f328c41788a2dd37c15acbb843c8f77ec0e770d772e65651234bcbe35e3c4a41271da7594a096544d946869a36e2cd187ed8f3bfbd019"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-runner-docker \
python3.11dist-avocado-framework-plugin-runner-docker \
python3dist-avocado-framework-plugin-runner-docker"

RDEPENDS:${PN} += "python-abi \
python3-aexpect \
python3-avocado \
python3-avocado-plugins-runner-remote"

inherit rpm
