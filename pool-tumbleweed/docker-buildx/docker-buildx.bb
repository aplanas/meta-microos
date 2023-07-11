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

PV = "0.11.1"

RPM_NAME = "docker-buildx-0.11.1-1.1.aarch64.rpm"
RPM_HASH = "6cc64edbf75858c28fa3f8fd05af283e52cafd03c10f58385b0573f474106e93e6eab1e35647e4326d19f87c9630282f3394950e67963823c812e5b4f4b0b542"

RPROVIDES:${PN} += "docker-buildx"

RDEPENDS:${PN} += "docker \
libc.so.6"

inherit rpm
