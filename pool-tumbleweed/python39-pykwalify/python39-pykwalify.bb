SUMMARY = "Python lib/cli for JSON/YAML schema validation"
DESCRIPTION = "YAML/JSON validation library \
This framework is a port with a lot added functionality of the java version of the framework kwalify that can be found at: http://www.kuwata-lab.com/kwalify/ \
The original source code can be found at: http://sourceforge.net/projects/kwalify/files/kwalify-java/0.5.1/ \
The source code of the latest release that has been used can be found at: https://github.com/sunaku/kwalify. Please note that source code is not the original authors code but a fork/upload of the last release available in ruby. \
The schema this library is base and extended from: http://www.kuwata-lab.com/kwalify/ruby/users-guide.01.html#schema"
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python39-pykwalify-1.8.0-1.10.noarch.rpm"
RPM_HASH = "ca76eb2fdd24a1e36154ac5b668372a15179ef3bb9ed775870f09e76b2d9f0f3749e5ad8d8219d837f7629c52147c9a349d861d75f94d763a16e4bc936a5bd26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pykwalify) \
python39-pykwalify \
python3dist(pykwalify)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-PyYAML \
python39-docopt \
python39-python-dateutil \
python39-ruamel.yaml \
update-alternatives"

inherit rpm
