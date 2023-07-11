SUMMARY = "JavaScript minifier"
DESCRIPTION = "JavaScript minifier."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-jsmin-3.0.1-1.8.noarch.rpm"
RPM_HASH = "a3a9c23047637c5580062f9284dc5a1f9af7310f45a99aaeec29a010ff6bd4abc6b478ff0537155184768659939f8354b00681e747998c795e2089bf8332831d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsmin \
python39-jsmin \
python3dist-jsmin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
