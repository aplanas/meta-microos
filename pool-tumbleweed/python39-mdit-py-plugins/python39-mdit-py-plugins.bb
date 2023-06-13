SUMMARY = "Collection of plugins for markdown-it-py"
DESCRIPTION = "Collection of core plugins for markdown-it-py."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-mdit-py-plugins-0.3.0-2.3.noarch.rpm"
RPM_HASH = "2433e2f068ac827d393c706a838f475f5229732a0963a0d98c1f17035689ce9db9baf60dd4f4e2c6596e7e59e8701aadad9fe9628b9390a5a93e8e62801825df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mdit-py-plugins) \
python39-mdit-py-plugins \
python3dist(mdit-py-plugins)"

RDEPENDS:${PN} += "python(abi) \
python39-markdown-it-py"

inherit rpm
