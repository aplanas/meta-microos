SUMMARY = "Pytest plugin for detecting inadvertent open file handles"
DESCRIPTION = "This package provides a plugin for the pytest framework that allows \
developers to detect whether any file handles or other file-like objects were \
inadvertently left open at the end of a unit test."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python39-pytest-openfiles-0.5.0-1.15.noarch.rpm"
RPM_HASH = "be5a47f008a2d71aab54cda97b296886dd0672f1891841ce4dbe0e963230579981966cf4ecae09d5841918b573e0e65d66d516a425f02c1a84b37feaf87b2389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-openfiles \
python39-pytest-openfiles \
python3dist-pytest-openfiles"

RDEPENDS:${PN} += "python-abi \
python39-psutil \
python39-pytest"

inherit rpm
