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

RPM_NAME = "python39-yamlloader-1.2.2-1.3.noarch.rpm"
RPM_HASH = "133ac0f50d8bcd3250505c6cf2d1836305c4753bf009088442788a7906650c45deae0fa3d8a389f1a0e8ec07db5342482fa25ae907a8e4eb01e1a8342218413d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yamlloader \
python39-yamlloader \
python3dist-yamlloader"

RDEPENDS:${PN} += "python-abi"

inherit rpm
