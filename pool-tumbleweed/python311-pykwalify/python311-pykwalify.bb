SUMMARY = "Python lib/cli for JSON/YAML schema validation"
DESCRIPTION = "YAML/JSON validation library \
This framework is a port with a lot added functionality of the java version of the framework kwalify that can be found at: http://www.kuwata-lab.com/kwalify/ \
The original source code can be found at: http://sourceforge.net/projects/kwalify/files/kwalify-java/0.5.1/ \
The source code of the latest release that has been used can be found at: https://github.com/sunaku/kwalify. Please note that source code is not the original authors code but a fork/upload of the last release available in ruby. \
The schema this library is base and extended from: http://www.kuwata-lab.com/kwalify/ruby/users-guide.01.html#schema"
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python311-pykwalify-1.8.0-1.10.noarch.rpm"
RPM_HASH = "d865cde698f09d1cd0c0c8736c2f0b55e822bb9ff03ed9d1b641f9a2f3872119da74e0d271c841eb142280fc62a7f4b9777e4700f43f0908dc87829979038fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pykwalify \
python311-pykwalify \
python3dist-pykwalify"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-PyYAML \
python311-docopt \
python311-python-dateutil \
python311-ruamel.yaml \
update-alternatives"

inherit rpm
