SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Official low-level client for Elasticsearch. Its goal is to provide common \
ground for all Elasticsearch-related code in Python; because of this it tries \
to be opinion-free and very extendable."
LICENSE = "Apache-2.0"

PV = "7.6.0"

RPM_NAME = "python310-elasticsearch-7.6.0-5.3.noarch.rpm"
RPM_HASH = "071a4346a2a1f5d22106a1671877aeb1f18a4d6dc16de364d332b831fd258cf5adb3c1e3d0fde4cf973acf7f387f2153e8505c3da95161e0966136c6b0118f9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-elasticsearch \
python310-elasticsearch \
python3dist-elasticsearch"

RDEPENDS:${PN} += "python-abi \
python310-elastic-transport"

inherit rpm
