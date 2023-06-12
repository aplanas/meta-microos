SUMMARY = "Avocado Runner for Execution on Docker Containers"
DESCRIPTION = "This plugin allows Avocado to run jobs within a Docker container, by \
interacting with a Docker daemon and attaching to the container itself. Avocado \
must have been previously installed in the container."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-runner-docker-69.0-6.10.noarch.rpm"
RPM_HASH = "5915678e631fdf800c31e564b994316ace426503525c6a55683f7e462a949381c507ba937fbd51dcfd32c7fe5e8e77237ccfed17b0f871c5965bf05e1006ad15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-runner-docker \
python3.10dist(avocado-framework-plugin-runner-docker) \
python3dist(avocado-framework-plugin-runner-docker)"
RDEPENDS:${PN} += "python(abi) \
python3-aexpect \
python3-avocado \
python3-avocado-plugins-runner-remote"

inherit rpm
