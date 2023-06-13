SUMMARY = "Hawk authentication strategy for the requests python library"
DESCRIPTION = "This project allows you to use the python requests library with the hawk \
authentification mechanism. \
 \
Hawk itself does not provide any mechanism for obtaining or transmitting the \
set of shared credentials required, but this project proposes a scheme we use \
across mozilla services projects."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python311-requests-hawk-1.2.1-1.1.noarch.rpm"
RPM_HASH = "b090629eec074bbb2fa22edfd17359be17a09c9ce1a3870867fc9704e52440d3a8f4c1c0969a9636558cea95bc2d63a6d938c3384a77bd76de4c0f7a6d5afda7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(requests-hawk) \
python311-requests-hawk \
python3dist(requests-hawk)"

RDEPENDS:${PN} += "python(abi) \
python311-mohawk \
python311-requests"

inherit rpm
