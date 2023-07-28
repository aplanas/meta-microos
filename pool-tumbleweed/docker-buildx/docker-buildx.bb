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

PV = "0.11.2"

RPM_NAME = "docker-buildx-0.11.2-1.1.aarch64.rpm"
RPM_HASH = "6d612d669739985f05a1c2d55d02f6388314b654ea598e2b52818c6e19c9e8bc0f18680ae474a5145bf6524169e4e1034444bbf1505fe270e97b56088a074af0"

RPROVIDES:${PN} += "docker-buildx"

RDEPENDS:${PN} += "docker \
libc.so.6"

inherit rpm
