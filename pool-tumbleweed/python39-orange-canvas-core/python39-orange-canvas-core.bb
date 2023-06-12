SUMMARY = "Core component of Orange Canvas"
DESCRIPTION = "Core component of Orange Canvas"
LICENSE = "GPL-3.0-only"

PV = "0.1.18"

RPM_NAME = "python39-orange-canvas-core-0.1.18-1.13.noarch.rpm"
RPM_HASH = "2987b80b19a989992768417192a3ffbfafb3096741efb71121bc53a0704cc62156a5b04948086d0a3da79f3fa5c4ef9b0c4f713477e217ba53d03cccdcfc4799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(orange-canvas-core) \
python39-orange-canvas-core \
python3dist(orange-canvas-core)"
RDEPENDS:${PN} += "python(abi) \
python39-AnyQt \
python39-CacheControl \
python39-commonmark \
python39-dictdiffer \
python39-docutils \
python39-qt5 \
python39-requests"

inherit rpm
