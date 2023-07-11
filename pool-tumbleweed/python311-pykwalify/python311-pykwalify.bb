SUMMARY = "Python lib/cli for JSON/YAML schema validation"
DESCRIPTION = "YAML/JSON validation library \
This framework is a port with a lot added functionality of the java version of the framework kwalify that can be found at: http://www.kuwata-lab.com/kwalify/ \
The original source code can be found at: http://sourceforge.net/projects/kwalify/files/kwalify-java/0.5.1/ \
The source code of the latest release that has been used can be found at: https://github.com/sunaku/kwalify. Please note that source code is not the original authors code but a fork/upload of the last release available in ruby. \
The schema this library is base and extended from: http://www.kuwata-lab.com/kwalify/ruby/users-guide.01.html#schema"
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python311-pykwalify-1.8.0-1.12.noarch.rpm"
RPM_HASH = "518371e6c3d939771e7c8b6f8d629c0a4212bddc727f2c31c68ec4736500413b6c907e8832da56065b5e1416b5ff006f8b1acffa118eba1be08eca5b439fdc54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pykwalify \
python3.11dist-pykwalify \
python311-pykwalify \
python3dist-pykwalify"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-docopt \
python311-python-dateutil \
python311-ruamel.yaml \
update-alternatives"

inherit rpm
