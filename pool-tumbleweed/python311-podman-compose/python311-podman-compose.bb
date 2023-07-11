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

RPM_NAME = "python311-podman-compose-1.0.6-2.3.noarch.rpm"
RPM_HASH = "783494bc1e752f868a3658595e483e4549f1b2ff2f192bd3261682e00c77e8784ddf144f7e8ea6fafd0f7d6ccea0e2de4542196c891d866810ca67a200d9ea86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "podman-compose \
python3-podman-compose \
python3.11dist-podman-compose \
python311-podman-compose \
python3dist-podman-compose"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
podman \
python-abi \
python311-PyYAML \
python311-python-dotenv \
python311-setuptools \
update-alternatives"

inherit rpm
