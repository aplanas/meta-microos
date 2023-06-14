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

RPM_NAME = "python39-hatch_nodejs_version-0.3.1-2.3.noarch.rpm"
RPM_HASH = "f1eca854cd9889dec67667d5a358ab2367f9027c813be91337d29907d3c73c24c1edeaf4a97e493d1a7722fd2f88eb0a486bc01da22538127452494b327d2b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hatch-nodejs-version \
python39-hatch-nodejs-version \
python3dist-hatch-nodejs-version"

RDEPENDS:${PN} += "python-abi \
python39-hatchling"

inherit rpm
