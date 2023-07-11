SUMMARY = "Ordered YAML loader and dumper for PyYAML"
DESCRIPTION = "This module provides loaders and dumpers for PyYAML. Currently, an \
OrderedDict loader/dumper is implemented, allowing to keep items order \
when loading resp. dumping a file from/to an OrderedDict (Python 3.7: \
Also regular dicts are supported and are the default items to be loaded \
to. As of Python 3.7 preservation of insertion order is a language \
feature of regular dicts.) \
 \
[API Documentation](https://phynix.github.io/yamlloader/index.html)."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python39-yamlloader-1.2.2-1.5.noarch.rpm"
RPM_HASH = "316312f0d6df0d379f1ec875cf2f3bc27b01cd7293bd3b7b1cb974aa0562fed1c51cfabcfd664b1b00789561e1b43629f92109a0aa468e97a27c20b8e6a2c58f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yamlloader \
python39-yamlloader \
python3dist-yamlloader"

RDEPENDS:${PN} += "python-abi"

inherit rpm
