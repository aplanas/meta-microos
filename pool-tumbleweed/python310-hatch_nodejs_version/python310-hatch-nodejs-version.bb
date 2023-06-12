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

RPM_NAME = "python310-hatch_nodejs_version-0.3.1-2.3.noarch.rpm"
RPM_HASH = "e8a28480accbe56052d2d34e00120d34e9f2d15f378721f523d63fbade89cd03003400dae9a339c133baf3c5c8dd5ee46fb5c697278d832c815d4db4646ca568"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch-nodejs-version \
python3-hatch_nodejs_version \
python3.10dist(hatch-nodejs-version) \
python310-hatch-nodejs-version \
python310-hatch_nodejs_version \
python3dist(hatch-nodejs-version)"
RDEPENDS:${PN} += "python(abi) \
python310-hatchling"

inherit rpm
