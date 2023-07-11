SUMMARY = "Command-line interface for python modules"
DESCRIPTION = "entrypoint2 is a command-line interface for python modules, forked \
off entrypoint."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "python311-entrypoint2-1.1-2.2.noarch.rpm"
RPM_HASH = "7231e235a9875d731b6e9a9da0d390fcd5c086e94e0644627f08d79ab93da9b8998f9f460f8075c59344518ba9dd369d8f931e5d93659cf86f5b4f63ce73f20e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-entrypoint2 \
python3.11dist-entrypoint2 \
python311-entrypoint2 \
python3dist-entrypoint2"

RDEPENDS:${PN} += "python-abi \
python311-EasyProcess \
python311-decorator \
python311-path.py"

inherit rpm
