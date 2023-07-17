SUMMARY = "A CLI tool for accessing the Redfish API"
DESCRIPTION = "redfishtool is a commandline tool that implements the client side \
of the Redfish RESTful API for Data Center Hardware Management."
LICENSE = "BSD-3-Clause"

PV = "1.1.5"

RPM_NAME = "redfishtool-1.1.5-2.1.noarch.rpm"
RPM_HASH = "c260a26a15dc8a90bbafa855240e11d56d7b1bb592a441d51693e6a0d8d6b0649aa6bce228a8c23d234be21ad919dd90d2b1f8a290f47e554944bbbf570bd20c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-redfishtool \
python3dist-redfishtool \
redfishtool"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-dateutils \
python3-requests"

inherit rpm
