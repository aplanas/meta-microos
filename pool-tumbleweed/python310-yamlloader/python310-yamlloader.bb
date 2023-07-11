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

RPM_NAME = "python310-yamlloader-1.2.2-1.5.noarch.rpm"
RPM_HASH = "22cd8f3da97c0edf1a36ac4fa5e0108ff0befbaf676f303d2c9f8a7e666cdfc4c66e25d311e975eb4e063e6538fe027dce9167c7f46dea58ad57d732f8503954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-yamlloader \
python310-yamlloader \
python3dist-yamlloader"

RDEPENDS:${PN} += "python-abi"

inherit rpm
