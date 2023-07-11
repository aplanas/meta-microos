SUMMARY = "Build APKs from source code"
DESCRIPTION = "Build apk packages using declarative pipelines. \
 \
Commonly used to provide custom packages for container images built with apko. The majority of apks are built for use with either the Wolfi or Alpine Linux ecosystems. \
 \
Key features: \
 \
* Pipeline-oriented builds. Every step of the build pipeline is defined and controlled by you, unlike traditional package managers which have distinct phases. \
* Multi-architecture by default. QEMU is used to emulate various architectures, avoiding the need for cross-compilation steps."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "melange-0.3.2-1.3.aarch64.rpm"
RPM_HASH = "0686d06f1cf76e4ede05a3a57a125a8ac1ed1e22f94680f96431d349977d97e18e95b02f08ab654294e3f4a1a9a0300b63439dcfa30947d3c3de967dd3796842"

RPROVIDES:${PN} += "melange"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
