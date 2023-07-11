SUMMARY = "Python module to draw ASCII trees"
DESCRIPTION = "ASCIItree draws tree structures using characters."
LICENSE = "MIT"

PV = "0.3.3"

RPM_NAME = "python39-asciitree-0.3.3-3.13.noarch.rpm"
RPM_HASH = "0365e8597a13a093ec1a402731b46323da317cf8024fcbde049add966f3fdc8ede776a94af71a9cc736696ed6722db174f8ceed2a8f81183ebe842d50fd757b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asciitree \
python39-asciitree \
python3dist-asciitree"

RDEPENDS:${PN} += "python-abi"

inherit rpm
