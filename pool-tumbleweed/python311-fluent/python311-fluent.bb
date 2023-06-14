SUMMARY = "Localization library for expressive translations"
DESCRIPTION = "A localization framework for natural language translations."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python311-fluent-0.10.0-3.11.noarch.rpm"
RPM_HASH = "b9fc5680987f5bcbad3dd5df489863e75c34b63ede5f053dd1f48cb728dd729d4e6520c6af9e3165f09df9db9a797e008d2890b8c3193a30f2bf5548c3c2830c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-fluent \
python311-fluent \
python3dist-fluent"

RDEPENDS:${PN} += "python-abi"

inherit rpm
