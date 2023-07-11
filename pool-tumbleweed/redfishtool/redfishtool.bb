SUMMARY = "A CLI tool for accessing the Redfish API"
DESCRIPTION = "redfishtool is a commandline tool that implements the client side \
of the Redfish RESTful API for Data Center Hardware Management."
LICENSE = "BSD-3-Clause"

PV = "1.1.5"

RPM_NAME = "redfishtool-1.1.5-1.8.noarch.rpm"
RPM_HASH = "03bae107a336018ce24be3082711ccc58a4835dae7c9e8696a8e0d06e1109ee2b5dd8a9936b2b91fcec85b938ac772d692e1fd146f3260c9317e80e2b4a97a47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-redfishtool \
python3dist-redfishtool \
redfishtool"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-requests"

inherit rpm
