SUMMARY = "Logging integration for Click"
DESCRIPTION = "Integrates logging with click. \
*This is rather experimental.  See tests for usage for now.*"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-click-log-0.4.0-1.8.noarch.rpm"
RPM_HASH = "2328eb3762ad5943170800cb0835283257c6100fdac3bfa6103d5d91fab3ee71a733ed4ef5209fc1070e4884261d3ae96ec1f45048f997a72c0553341ac221b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-click-log \
python39-click-log \
python3dist-click-log"

RDEPENDS:${PN} += "python-abi \
python39-click"

inherit rpm
