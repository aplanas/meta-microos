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

RPM_NAME = "python310-hatch_nodejs_version-0.3.1-2.5.noarch.rpm"
RPM_HASH = "15ce5872d6d0ba67faf9d0fb645877071b7a87e64507baf1c0990defdc1d030a4bd285d787fbcd74da9003aafac91a7b819f26779c8de49a3cfc1d8086a89dac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hatch-nodejs-version \
python310-hatch-nodejs-version \
python3dist-hatch-nodejs-version"

RDEPENDS:${PN} += "python-abi \
python310-hatchling"

inherit rpm
