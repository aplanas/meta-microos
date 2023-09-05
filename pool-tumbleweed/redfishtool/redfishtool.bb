SUMMARY = "A CLI tool for accessing the Redfish API"
DESCRIPTION = "redfishtool is a commandline tool that implements the client side \
of the Redfish RESTful API for Data Center Hardware Management."
LICENSE = "BSD-3-Clause"

PV = "1.1.8"

RPM_NAME = "redfishtool-1.1.8-1.1.noarch.rpm"
RPM_HASH = "519ddc40aae08c592c707227a94dc4752c00453d9dae5781e8e7f9a6752b336a78dad5ab7c939f9bb749201ea38028be82af19bde5ef832640150de3c7ac47fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-redfishtool \
python3dist-redfishtool \
redfishtool"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-dateutil \
python3-requests"

inherit rpm
