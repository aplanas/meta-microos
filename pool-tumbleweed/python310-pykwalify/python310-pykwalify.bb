SUMMARY = "Python lib/cli for JSON/YAML schema validation"
DESCRIPTION = "YAML/JSON validation library \
This framework is a port with a lot added functionality of the java version of the framework kwalify that can be found at: http://www.kuwata-lab.com/kwalify/ \
The original source code can be found at: http://sourceforge.net/projects/kwalify/files/kwalify-java/0.5.1/ \
The source code of the latest release that has been used can be found at: https://github.com/sunaku/kwalify. Please note that source code is not the original authors code but a fork/upload of the last release available in ruby. \
The schema this library is base and extended from: http://www.kuwata-lab.com/kwalify/ruby/users-guide.01.html#schema"
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python310-pykwalify-1.8.0-1.10.noarch.rpm"
RPM_HASH = "4f17164a04ad27930cb450a70fa7bb52e9d625251900ff4058b790581034fb34c5aff5be9390fe87815e14e7912e1e84718d73bbaf69c6d8e92d49b116d78507"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pykwalify \
python3.10dist-pykwalify \
python310-pykwalify \
python3dist-pykwalify"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-docopt \
python310-python-dateutil \
python310-ruamel.yaml \
update-alternatives"

inherit rpm
