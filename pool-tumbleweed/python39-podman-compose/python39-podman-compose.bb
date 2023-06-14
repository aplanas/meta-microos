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

RPM_NAME = "python39-podman-compose-1.0.6-2.1.noarch.rpm"
RPM_HASH = "636393a213763b35161a2ddf940adc892c91bcdd9a3a211409aad357fcdfec34716a59f92a8820dbeb505a888233b49c2983577756a0fcad5141df5da5bedc6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "podman-compose \
python3.9dist-podman-compose \
python39-podman-compose \
python3dist-podman-compose"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
podman \
python-abi \
python39-PyYAML \
python39-python-dotenv \
python39-setuptools \
update-alternatives"

inherit rpm
