SUMMARY = "A script to run docker-compose using podman"
DESCRIPTION = "An implementation of `docker-compose` with podman backend. \
The main objective of this project is to be able to run `docker-compose.yml` \
unmodified and rootless.  This project is aimed to provide drop-in replacement \
for `docker-compose`, and it's very useful for certain cases because: \
 \
- can run rootless \
- only depend on `podman` and Python3 and PyYAML \
- no daemon, no setup \
- can be used by developers to run single-machine containerized stacks using \
  single familiar YAML file"
LICENSE = "GPL-2.0-only"

PV = "1.0.6"

RPM_NAME = "python39-podman-compose-1.0.6-2.3.noarch.rpm"
RPM_HASH = "486bc2af08c3904a6e6642e3087ec0bd5020f2acb0fdb68874b89d507de5b81c4eccb7304716c452abd6d0f5c19a8866609cb49c904afeafb5761ee85fe08f5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "podman-compose \
python3.9dist-podman-compose \
python39-podman-compose \
python3dist-podman-compose"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
podman \
python-abi \
python39-PyYAML \
python39-python-dotenv \
python39-setuptools \
update-alternatives"

inherit rpm
