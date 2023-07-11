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

RPM_NAME = "python311-yamlloader-1.2.2-1.5.noarch.rpm"
RPM_HASH = "23b4f39c97ca9911b7270f4faeecd9c399805df19656310301d8c1ddb163fac1a5e43f0ada519b3893600dee6925db9c3b01ed20952e313a0fa443feceabf941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yamlloader \
python3.11dist-yamlloader \
python311-yamlloader \
python3dist-yamlloader"

RDEPENDS:${PN} += "python-abi"

inherit rpm
