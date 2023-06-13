SUMMARY = "Docker Bench for Security"
DESCRIPTION = "The Docker Bench for Security is a script that checks for dozens of common \
best-practices around deploying Docker containers in production. \
 \
The tests are all automated, and implement the CIS Docker Benchmark."
LICENSE = "Apache-2.0"

PV = "1.3.5"

RPM_NAME = "docker-bench-security-1.3.5-2.9.noarch.rpm"
RPM_HASH = "6c51e3d22148ce385b4c806e471f9acd5e9d65b74461be0465e10f16a8243678dfc1224a2512e3d610731bbcd23e69417c38e38038734d61b29f66867a025ed4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-bench-security"

RDEPENDS:${PN} += "/bin/sh \
audit \
docker \
findutils \
net-tools \
net-tools-deprecated"

inherit rpm
