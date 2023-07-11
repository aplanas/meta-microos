SUMMARY = "Replacement for the docker-compose (python) executable"
DESCRIPTION = "Compose Switch is a replacement to the Compose V1 docker-compose (python) executable. It translates the command line into Compose V2 docker compose then run the latter."
LICENSE = "Apache-2.0"

PV = "1.0.5"

RPM_NAME = "docker-compose-switch-1.0.5-1.6.aarch64.rpm"
RPM_HASH = "46ae852a66e17a3f0032fb94fbbab28c9f69a5845781e315a345ca0f2eb1e5892a30547e2fc0d8c65b5eb8568c11369aec90cb630e2333e674741a6935a17e57"

RPROVIDES:${PN} += "docker-compose-switch"

RDEPENDS:${PN} += "/usr/bin/sh \
docker \
docker-compose \
libc.so.6 \
update-alternatives"

inherit rpm
