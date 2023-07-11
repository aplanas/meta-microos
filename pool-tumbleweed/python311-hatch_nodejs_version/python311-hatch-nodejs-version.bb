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

RPM_NAME = "python311-hatch_nodejs_version-0.3.1-2.5.noarch.rpm"
RPM_HASH = "48a7c6a151c9a8d0f1f3551ddb22a909c7cfebc1b9e01206b9726180125f53fef954cbcf748d43a1d3d11a3f139f0f06644978e68e80f29cc998528209c6ae64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch-nodejs-version \
python3.11dist-hatch-nodejs-version \
python311-hatch-nodejs-version \
python3dist-hatch-nodejs-version"

RDEPENDS:${PN} += "python-abi \
python311-hatchling"

inherit rpm
