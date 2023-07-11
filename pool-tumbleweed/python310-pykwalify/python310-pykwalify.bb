SUMMARY = "Python lib/cli for JSON/YAML schema validation"
DESCRIPTION = "YAML/JSON validation library \
This framework is a port with a lot added functionality of the java version of the framework kwalify that can be found at: http://www.kuwata-lab.com/kwalify/ \
The original source code can be found at: http://sourceforge.net/projects/kwalify/files/kwalify-java/0.5.1/ \
The source code of the latest release that has been used can be found at: https://github.com/sunaku/kwalify. Please note that source code is not the original authors code but a fork/upload of the last release available in ruby. \
The schema this library is base and extended from: http://www.kuwata-lab.com/kwalify/ruby/users-guide.01.html#schema"
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python310-pykwalify-1.8.0-1.12.noarch.rpm"
RPM_HASH = "4aea043a37a36f6731e92a4c01b75223aad3cb62266060d808cb1baa3c6a912c9cc3754e0ea6fb5d11ec90ce329ff4aa88ce1f4117e7e17de55efa362210ec03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pykwalify \
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
