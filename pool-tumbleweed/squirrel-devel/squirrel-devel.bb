SUMMARY = "Development files for squirrel"
DESCRIPTION = "This package contains everything to embed the Squirrel engine in \
your own application."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "squirrel-devel-3.2-2.3.aarch64.rpm"
RPM_HASH = "b12a36d72dc8de85e59e40858aec0f1d280651e935fca29180290e80d7a7ad56f304eddea48d97c334539c71e8d31dec46a2293cbd66f697527418b037d6472e"

RPROVIDES:${PN} += "cmake-squirrel \
squirrel-devel"

RDEPENDS:${PN} += "libsquirrel1001"

inherit rpm
