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

PV = "0.10.4"

RPM_NAME = "docker-buildx-0.10.4-1.3.aarch64.rpm"
RPM_HASH = "27291bd09be060a8606eea26b2d2716acd3897a9fd60d03564f64a0ac08ef5b89f33ac21af23a1e3fc90c51476c8ccf1301d725517f633a50076f83be6c9f487"

RPROVIDES:${PN} += "docker-buildx docker-buildx(aarch-64)"
RDEPENDS:${PN} += "docker libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
