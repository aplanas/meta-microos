SUMMARY = "Source code of bazel-compilation-database"
DESCRIPTION = "A JSON Compilation Database generator following the Clang specification \
for Bazel. \
 \
This package contains source code of bazel-compilation-database."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "bazel-compilation-database-source-0.4.1-1.10.noarch.rpm"
RPM_HASH = "79f6e7c5de42718b6d970ba0e01120dcda891697d9fc3ef326dea26375255e5f43b4c5eae346afb54bd79db9397ca6e58bc413cb22f6828914f8a4a4b298dc76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-compilation-database-source"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
