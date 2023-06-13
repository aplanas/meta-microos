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

RPM_NAME = "python310-podman-compose-1.0.6-2.1.noarch.rpm"
RPM_HASH = "a952f97bce5951842f800c676eae81937247ce11ba1c6c20f8cbd5c355ef82070c1e7f01849b5d1bf592de45ec48671133c5b651d736d99c6c84af9fa6a5f9d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "podman-compose \
python3-podman-compose \
python3.10dist(podman-compose) \
python310-podman-compose \
python3dist(podman-compose)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
podman \
python(abi) \
python310-PyYAML \
python310-python-dotenv \
python310-setuptools \
update-alternatives"

inherit rpm
