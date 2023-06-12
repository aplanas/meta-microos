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

RPM_NAME = "python311-yamlloader-1.2.2-1.3.noarch.rpm"
RPM_HASH = "3ea1fab691c96fb1fa11b628bb2ac94cfdb16b536e4563d0f3abfa9cbd84b49c996ff12e3e5b4943bb084492e8dc0009fb3cd56f13a9b91bdaf7d7df045a61a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(yamlloader) \
python311-yamlloader \
python3dist(yamlloader)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
