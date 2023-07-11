SUMMARY = "This package provides two Hatch plugins for nodejs"
DESCRIPTION = "Hatch plugin to read pyproject.toml metadata from package.json \
 \
This package provides two Hatch plugins: \
 \
* version source plugin that reads/writes the package version \
  from the version field of the Node.js package.json file. \
* metadata hook plugin that reads PEP 621 metadata from the \
  Node.js package.json file."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python39-hatch_nodejs_version-0.3.1-2.5.noarch.rpm"
RPM_HASH = "2e6cd2b9e7e5a8d4222d4292aabf15707ea89bc78f2b006cb56bb6cf79f75504f21d102853cce809d97b160c97e413ea49c153a109e362a8bc7a30d27b44a126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hatch-nodejs-version \
python39-hatch-nodejs-version \
python3dist-hatch-nodejs-version"

RDEPENDS:${PN} += "python-abi \
python39-hatchling"

inherit rpm
