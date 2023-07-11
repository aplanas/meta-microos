SUMMARY = "Python lib/cli for JSON/YAML schema validation"
DESCRIPTION = "YAML/JSON validation library \
This framework is a port with a lot added functionality of the java version of the framework kwalify that can be found at: http://www.kuwata-lab.com/kwalify/ \
The original source code can be found at: http://sourceforge.net/projects/kwalify/files/kwalify-java/0.5.1/ \
The source code of the latest release that has been used can be found at: https://github.com/sunaku/kwalify. Please note that source code is not the original authors code but a fork/upload of the last release available in ruby. \
The schema this library is base and extended from: http://www.kuwata-lab.com/kwalify/ruby/users-guide.01.html#schema"
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python39-pykwalify-1.8.0-1.12.noarch.rpm"
RPM_HASH = "3ec87942a0239fdd4d14fcdc705964faa3ed75a4b40b6f0a0324f36f67f5b081dad3f9a58812e1766466ae10d532567c2140af244065fe32f6cbed85d4aeaeac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pykwalify \
python39-pykwalify \
python3dist-pykwalify"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-docopt \
python39-python-dateutil \
python39-ruamel.yaml \
update-alternatives"

inherit rpm
