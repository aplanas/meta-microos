SUMMARY = "Docker CLI plugin for extended build capabilities with BuildKit"
DESCRIPTION = "buildx is a Docker CLI plugin for extended build capabilities with BuildKit. \
 \
Key features: \
- Familiar UI from docker build \
- Full BuildKit capabilities with container driver \
- Multiple builder instance support \
- Multi-node builds for cross-platform images \
- Compose build support \
- High-level build constructs (bake) \
- In-container driver support (both Docker and Kubernetes)"
LICENSE = "Apache-2.0"

PV = "0.10.5"

RPM_NAME = "docker-buildx-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "bdfda7da634f27b7cfc29585a55e1d8c193d45efabedf11d1586919c53f5af8c155a77f4cb1933a4db26f31172600e9c9265e078fbca09202bea44933edf26cb"

RPROVIDES:${PN} += "docker-buildx \
docker-buildx(aarch-64)"

RDEPENDS:${PN} += "docker \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
