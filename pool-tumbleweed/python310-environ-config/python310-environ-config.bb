SUMMARY = "Boilerplate-free configuration with env variables"
DESCRIPTION = "Boilerplate-free configuration with env variables."
LICENSE = "MIT"

PV = "23.2.0"

RPM_NAME = "python310-environ-config-23.2.0-1.2.noarch.rpm"
RPM_HASH = "69f58efe8cd06e6a4617a2b570cff0861b65a33168578ce5472afe963a1f7a92603596f49cddce055f005a36a2dea06bd4e9668f885d9d21ec942ff2313aaa9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-environ-config \
python310-environ-config \
python3dist-environ-config"

RDEPENDS:${PN} += "python-abi \
python310-attrs"

inherit rpm
