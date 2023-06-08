SUMMARY = "Bazel workspaces for libraries packaged in openSUSE"
DESCRIPTION = "Bazel workspaces for libraries packaged in openSUSE which allow to link those \
libraries dynamically to software build by Bazel."
LICENSE = "Apache-2.0"

PV = "20200113"

RPM_NAME = "bazel-workspaces-20200113-1.10.noarch.rpm"
RPM_HASH = "5b4e59d8a294ba682152c657aa030fda18b2b8f21c3e6e375c2fff79c038ebb13876ba5436bae07854cdedf5b3065dc27855f3be7a4eaeb27a7bda69fd03e558"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-workspaces"
RDEPENDS:${PN} += ""

inherit rpm
