SUMMARY = "Thread-pool Controls"
DESCRIPTION = "Python helpers to limit the number of threads used in native \
libraries that handle their own internal threadpool (BLAS \
and OpenMP implementations)."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python39-threadpoolctl-3.1.0-2.1.noarch.rpm"
RPM_HASH = "0a43187fbe18581cf3a763f6413ec69926494e9aa28a25e98f6fd14005e46b313dcbe7b0a01c09241a69edbac642267b715acb508236b4177bf60081f21a43be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(threadpoolctl) \
python39-threadpoolctl \
python3dist(threadpoolctl)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
