SUMMARY = "A pytest plugin that allows multiple failures per test"
DESCRIPTION = "A pytest plugin that allows multiple failures per test. A rewrite of pytest-expect"
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python311-pytest-check-1.0.5-1.8.noarch.rpm"
RPM_HASH = "a27f4293929baf3991ae88df6e476fbf514a2a45c60cb8c9ed7b4958215db4080f297fea5047bfb4e9f76837a1ac4eb0dd442de246af1f17a7204f555b84c8c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-check \
python311-pytest-check \
python3dist-pytest-check"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
