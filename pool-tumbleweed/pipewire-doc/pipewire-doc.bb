SUMMARY = "PipeWire media server documentation"
DESCRIPTION = "This package contains documentation for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.77"

RPM_NAME = "pipewire-doc-0.3.77-2.1.aarch64.rpm"
RPM_HASH = "73c065148ea479d9583c96bbb1aae74304b5d7f7d1ac89f1716a6a945dd76ea2a8aa98461c085cbadcfe46820af4265566ff69580e94e78c732d0c850cd8cc28"

RPROVIDES:${PN} += "pipewire-doc"

RDEPENDS:${PN} += ""

inherit rpm
