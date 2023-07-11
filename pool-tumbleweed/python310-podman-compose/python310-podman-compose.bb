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

RPM_NAME = "python310-podman-compose-1.0.6-2.3.noarch.rpm"
RPM_HASH = "d836f089104185b9276bac9201e898e4fd42dccc5fc513d28d77b352a346e3aab2d1e55f32e66ceaeb747ab960c72dcd9613ed3fc242277a012af58e9588223d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "podman-compose \
python3.10dist-podman-compose \
python310-podman-compose \
python3dist-podman-compose"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
podman \
python-abi \
python310-PyYAML \
python310-python-dotenv \
python310-setuptools \
update-alternatives"

inherit rpm
