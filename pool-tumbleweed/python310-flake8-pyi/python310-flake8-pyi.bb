SUMMARY = "A plugin for flake8 to enable linting .pyi files"
DESCRIPTION = "A plugin for Flake8 that provides specializations for type hinting stub \
files. Especially interesting for linting typeshed."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python310-flake8-pyi-23.1.2-1.4.noarch.rpm"
RPM_HASH = "ac6ed1dad8c3178fb51380b3ed9a11b63429947b70a97cd6a04c4197514d67611b617f1ae01df46fa418d862603a95abddd08489db1639a68315ceac0700c7d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8-pyi \
python310-flake8-pyi \
python3dist-flake8-pyi"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-base \
python310-flake8 \
python310-pyflakes \
python310-typing"

inherit rpm
