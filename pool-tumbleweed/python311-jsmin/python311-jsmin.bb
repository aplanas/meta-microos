SUMMARY = "JavaScript minifier"
DESCRIPTION = "JavaScript minifier."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-jsmin-3.0.1-1.6.noarch.rpm"
RPM_HASH = "a05aae5394ec938016a845933cc0e2f1b17f1fa0d5f69e834bbca8c53711f951003549a6ef432e3cd5aa425e983b133212787a763c6dca0ad545a822b226730a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jsmin) \
python311-jsmin \
python3dist(jsmin)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
