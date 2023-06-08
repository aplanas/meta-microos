SUMMARY = "Source code of bazel-toolchains"
DESCRIPTION = "bazel-toolchains is a repository of commonly used Bazel toolchain configuration \
files. They are required to configure Bazel to work inside a Docker container \
via a remote execution environment. \
 \
This package contains source code of bazel-toolchains."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "bazel-toolchains-source-2.0.0-1.9.noarch.rpm"
RPM_HASH = "2e3c92920e61e03d6fdec2cfe02a31035a0028a9c56c6f3ba120489d6d984c2367aa9f1b4da2fa165371d930917cc5f8f09c90d2cc8ea36cef9c0933015b2838"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-toolchains-source"
RDEPENDS:${PN} += "/bin/bash /usr/bin/env"

inherit rpm
