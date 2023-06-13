SUMMARY = "Replacement for the docker-compose (python) executable"
DESCRIPTION = "Compose Switch is a replacement to the Compose V1 docker-compose (python) executable. It translates the command line into Compose V2 docker compose then run the latter."
LICENSE = "Apache-2.0"

PV = "1.0.5"

RPM_NAME = "docker-compose-switch-1.0.5-1.5.aarch64.rpm"
RPM_HASH = "b09b87406fbb0962afdbcc52173e80aa8a1637999a8e67f6e417899dd50ae018fa2d8ff561e69da15f15dcf776e7a60f6fdc957c3c80dc2397f2d1dd72237819"

RPROVIDES:${PN} += "docker-compose-switch \
docker-compose-switch(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
docker \
docker-compose \
libc.so.6()(64bit) \
update-alternatives"

inherit rpm
